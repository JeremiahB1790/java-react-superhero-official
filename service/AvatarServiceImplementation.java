package com.martial.law.jeremiah.martiallaw.service;

import com.martial.law.jeremiah.martiallaw.models.Avatar;
import com.martial.law.jeremiah.martiallaw.repository.AvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvatarServiceImplementation implements AvatarService{

    @Autowired
    private AvatarRepository avatarRepository;

    @Override
    public Avatar saveAvatar(Avatar avatar) {
        return avatarRepository.save(avatar);
    }
}
