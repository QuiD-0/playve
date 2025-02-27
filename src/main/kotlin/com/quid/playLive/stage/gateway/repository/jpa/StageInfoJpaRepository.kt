package com.quid.playLive.stage.gateway.repository.jpa

import org.springframework.data.jpa.repository.JpaRepository

interface StageInfoJpaRepository : JpaRepository<StageInfoEntity, Long>{
    fun findByMemberId(memberId: Long): StageInfoEntity?
}
