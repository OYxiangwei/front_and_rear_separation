package com.oy.front_and_rear_separation.service;

import com.oy.front_and_rear_separation.entity.AdminUser;
import com.oy.front_and_rear_separation.utils.PageResult;
import com.oy.front_and_rear_separation.utils.PageUtil;

public interface AdminUserService {
    AdminUser updateTokenAndLogin(String userName, String password);
    PageResult getAdminUserPage(PageUtil pageUtil);
    AdminUser selectById(Long id);
    AdminUser selectByUserName(String userName);
    int save(AdminUser user);
    int updatePassword(AdminUser user);
    int deleteBatch(Integer[] ids);
    AdminUser getAdminUserByToken(String userToken);
}
