package tk.mybatis.simple.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SysUser implements Serializable {
    private static final long serialVersionUID = -328602757171077630L;
    private Long id;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userInfo;
    private byte[] headImg;
    private Date createTime;

    //--------上面是原有属性--------
    private SysRole role;
    private List<SysRole> roleList;

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
