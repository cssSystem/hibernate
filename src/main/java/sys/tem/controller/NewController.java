package sys.tem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roles")
public class NewController {
    private String read = "Страница с ролью <b>READ</b> анотации <b>@Secured</b>";
    private String write = "Страница с ролью <b>WRITE</b> анотации <b>@RolesAllowed</b>";
    private String word = "Страница с ролью <b>WRITE</b> или <b>DELETE</b> анотации <b>@PreAutorize</b>";
    private String unm = "Имя <b>%s</b> совпадает с именем пользователя в объекте <b>Authentication</b>";

    @Secured({"ROLE_READ"})
    @GetMapping("/read")
    public String getRoleREAD() {
        return read;
    }

    @RolesAllowed({"ROLE_WRITE"})
    @GetMapping("/write")
    public String getRoleWRITE() {
        return write;
    }

    @PreAuthorize("hasAnyRole('WRITE','DELETE')")
    @GetMapping("/word")
    public String getWriteOrDelete() {
        return word;
    }

    @GetMapping("/unm")
    public String getUserNameMatches(@RequestParam String username) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getName().equals(username)) {
            return String.format(unm, username);
        }
        return null;
    }
}
