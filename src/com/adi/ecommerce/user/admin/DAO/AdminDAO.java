package com.adi.ecommerce.user.admin.DAO;

import com.adi.ecommerce.user.user.DAO.UserDAO;
import com.adi.ecommerce.user.user.Entity.User;

import java.util.List;

public interface AdminDAO extends UserDAO {
    <T extends User> List<T> getAll(Class<T> type);
    boolean addInApprovalList(String shopId, boolean toAdd);
    boolean deleteUser(String userId);
}
