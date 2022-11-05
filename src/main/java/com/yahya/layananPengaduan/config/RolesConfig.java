package com.yahya.layananPengaduan.config;


import com.yahya.layananPengaduan.model.ERole;
import com.yahya.layananPengaduan.model.Roles;
import com.yahya.layananPengaduan.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RolesConfig {

    private static final Logger LOG = LoggerFactory.getLogger(RolesConfig.class);

    RolesConfig(RoleRepository roleRepository) {
        LOG.info("Test RolesConfig run");
        for(ERole c : ERole.values()) {
            try {
                Roles roles = roleRepository.findByName(c)
                        .orElseThrow(() -> new RuntimeException("Roles not found"));
                LOG.info("Role {} has been found!", roles.getName());
            } catch(RuntimeException rte) {
                LOG.info("Role {} is not found, inserting to DB . . .", c.name());
                Roles roles = new Roles();
                roles.setName(c);
                roleRepository.save(roles);
            }
        }
    }
}