
package mindustry.ai.types;

import arc.math.*;
import mindustry.entities.*;
import mindustry.entities.units.*;
import mindustry.gen.*;

import static mindustry.Vars.*;

public class GBDefenderAI extends DefenderAI{
  Target(
    Boolean.ground = ifTrue{
      Boost = 0
    } 
  ) 
  Target(
    Boolean.air = ifTrue{
      Boost = 1
    } 
  )   
}