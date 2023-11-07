package com.martial.law.jeremiah.martiallaw.repository;

import com.martial.law.jeremiah.martiallaw.models.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarRepository extends JpaRepository<Avatar,Integer> {
}
