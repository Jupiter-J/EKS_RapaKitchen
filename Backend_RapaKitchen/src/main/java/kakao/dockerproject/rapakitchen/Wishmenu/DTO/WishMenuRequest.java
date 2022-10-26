package kakao.dockerproject.rapakitchen.Wishmenu.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WishMenuRequest {
    private String requestMenu;

    public String getRequestMenu() {
        return requestMenu;
    }
}
