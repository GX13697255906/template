package com.dms.cloud.biz301.client.model.bo;

import lombok.Data;
import java.io.Serializable;

/**
 * Description:
 *
 * @author taihaomaineng yabingsong
 * @date 2019-11-22
 */
@Data
public class RegisterBo implements Serializable {
    private String code;
    private String name;
}
