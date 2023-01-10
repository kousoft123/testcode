package com.project.booking.repository.user;
import java.util.List;

import com.project.booking.model.user.User;

public interface UserRepositoryCustom {
    public List<User> fetchUserByAgeAndLocality(int age, String locality);
}