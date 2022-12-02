
package mindustry.ai.types;

import arc.math.*;
import mindustry.entities.*;
import mindustry.entities.units.*;
import mindustry.gen.*;

import static mindustry.Vars.*;

public class GBDefenderAI extends DefenderAI{
  Target(
    Boolean.ground = true{
      Boost = 0
    } 
  ) 
  Target(
    Boolean.air = true{
      Boost = 1
    } 
  )   
}