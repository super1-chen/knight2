package com.sprintaction.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sprintaction.knights.Knight;
import com.sprintaction.knights.Quest;
import com.sprintaction.knights.BraveKnight;
import com.sprintaction.knights.SlayDragonQuest;
/**
 * @author albert.chen
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
