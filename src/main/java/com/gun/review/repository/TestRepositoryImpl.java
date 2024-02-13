package com.gun.review.repository;

import com.gun.review.model.QTestEntity;
import com.gun.review.model.TestEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class TestRepositoryImpl implements TestRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<TestEntity> findAllByNameByQuerydsl(String name) {
        return jpaQueryFactory.selectFrom(QTestEntity.testEntity)
                .fetch();
    }
}
