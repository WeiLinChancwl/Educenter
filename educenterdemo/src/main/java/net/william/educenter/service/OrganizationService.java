package net.william.educenter.service;
import net.william.educenter.entity.Organization;
import net.william.educenter.entity.OrganizationExample;
import net.william.educenter.mapper.OrganizationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrganizationService {

    @Resource
    private OrganizationMapper organizationMapper;

    public List<Organization> selectByExample(OrganizationExample OrganizationExample) {
        return organizationMapper.selectByExample(OrganizationExample);
    }
    public void insertOrganization(Organization Organization) {
        organizationMapper.insert(Organization);
    }
    public void deleteOrganization(OrganizationExample OrganizationExample) {
        organizationMapper.deleteByExample(OrganizationExample);
    }
    public void updateOrganization(Organization Organization, OrganizationExample OrganizationExample) {
        organizationMapper.updateByExample(Organization, OrganizationExample);
    }
}