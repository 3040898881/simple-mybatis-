package tk.mybatis.simple.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SysPrivilege implements Serializable {
    private static final long serialVersionUID = 6315662516417216377L;
    private Long id;
    private String privilegeName;
    private String privilegeUrl;
}
