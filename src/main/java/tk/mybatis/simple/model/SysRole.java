package tk.mybatis.simple.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import tk.mybatis.simple.type.Enabled;

@Getter
@Setter
public class SysRole implements Serializable {
    private static final long serialVersionUID = 6320941908222932112L;
    private Long id;
    private String roleName;
    private Enabled enabled;
    private String createBy;
    private Date createTime;

    //--------上面是原有属性--------
    private SysUser user;
    private CreateInfo createInfo;
    List<SysPrivilege> privilegeList;
}
