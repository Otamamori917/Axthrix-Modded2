
package mindustry.ai.types;

import arc.math.*;
import mindustry.entities.*;
import mindustry.entities.units.*;
import mindustry.gen.*;

import static mindustry.Vars.*;

public class GBDefenderAI extends DefenderAI{
  target(
    boolean.ground = ifTrue{
      boost = 0
    } 
  ) 
  target(
    boolean.air = ifTrue{
      boost = 1
    } 
  )   
}