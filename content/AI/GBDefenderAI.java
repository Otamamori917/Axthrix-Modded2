
package mindustry.ai.types;

import arc.math.*;
import mindustry.entities.*;
import mindustry.entities.units.*;
import mindustry.gen.*;

import static mindustry.Vars.*;

public class GBDefenderAI extends DefenderAI{
  target(
    Boolean.ground = ifTrue{
      Boost = 0
    } 
  ) 
  target(
    Boolean.air = ifTrue{
      Boost = 1
    } 
  )   
}