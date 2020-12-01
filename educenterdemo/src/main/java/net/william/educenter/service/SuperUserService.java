package net.william.educenter.service;
import net.william.educenter.entity.SuperUser;
import net.william.educenter.entity.SuperUserExample;
import net.william.educenter.mapper.SuperUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SuperUserService {
    @Resource
    private SuperUserMapper superUserMapper;

    public List<SuperUser> selectByExample(SuperUserExample superUserExample) {
        return superUserMapper.selectByExample(superUserExample);
    }
    public void insertSuperUser(SuperUser superuser) {
        superUserMapper.insert(superuser);
    }

    public void deleteSuperUser(SuperUserExample SuperUserExample) {
        superUserMapper.deleteByExample(SuperUserExample);
    }
    public void updateSuperUser(SuperUser superUser, SuperUserExample SuperUserExample) {
        superUserMapper.updateByExample(superUser, SuperUserExample);
    }
}