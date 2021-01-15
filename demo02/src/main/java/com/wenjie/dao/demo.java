package com.wenjie.dao;

import com.wenjie.domain.User;
import com.wenjie.domain.para;
import java.util.List;

public interface demo {

    public List<User> findall();

    public List<User> findeach(para pa);
}
