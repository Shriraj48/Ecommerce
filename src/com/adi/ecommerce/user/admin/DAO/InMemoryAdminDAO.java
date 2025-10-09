package com.adi.ecommerce.user.admin.DAO;

import com.adi.ecommerce.user.user.DAO.InMemoryUserDAO;
import com.adi.ecommerce.user.user.Entity.User;

import java.util.List;
import java.util.Optional;

public class InMemoryAdminDAO extends InMemoryUserDAO implements AdminDAO {
    private final List<String> approvalList;

    public InMemoryAdminDAO(List<User> userList, List<String> approvalList) {
        super(userList);
        this.approvalList = approvalList;
    }

    @Override
    public <T extends User> List<T> getAll(Class<T> instance) {
        return getAllUsers().stream()
                .filter(u -> instance.isAssignableFrom(u.getClass()))
                .map(u -> (T) u)
//                .filter(instance::isInstance)
//                .map(instance::cast)
                .toList();
    }


    @Override
    public boolean addInApprovalList(String shopId,boolean toAdd) {
        // if(toAdd){
        //     approvalList.add(shopId);
        //     getUserById(shopId).stream().map(s->{
        //         Shopkeeper shopkeeperToBeValidated = (Shopkeeper)s;
        //         shopkeeperToBeValidated.setShopValid(true);
        //         return true;
        //     });
        // }
        return false;
    }

    @Override
    public boolean deleteUser(String userId) {
        Optional<User> userToBeDeleted = getUserById(userId);
        if (userToBeDeleted.isPresent()) {
            return getAllUsers().remove(userToBeDeleted);
        }
        return false;
    }

}
