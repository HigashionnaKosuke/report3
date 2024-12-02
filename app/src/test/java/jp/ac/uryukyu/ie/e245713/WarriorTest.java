package jp.ac.uryukyu.ie.e245713;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 10);
        Enemy slime = new Enemy("スライムもどき", 50, 4);
        for(int i = 1; i <= 3;i ++){
            int slimeHitPoint = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            slime.attack(demoWarrior); 
            assertEquals(15, slimeHitPoint - slime.getHitPoint()); 
        }
    }
}
