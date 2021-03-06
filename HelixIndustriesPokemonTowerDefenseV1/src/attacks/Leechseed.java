package attacks;

import java.io.File;
import java.util.ArrayList;

import Mob.Mob;
import model.Tile;
import model.Type;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Ember.java - Class for the Ember attack
 */

public class Leechseed extends Attack
{
	public Leechseed()
	{
		super();
		super.name = "Leech Seed";
		super.damage = 1;
		super.verticalRange = 2;
		super.horizontalRange = 2;
		super.damageType = Type.GRASS;
		super.effect = Effect.poison;
		super.rangeType = RangeType.NORMAL;
		super.image = null;//unimplemented
		super.targets = 1;//unimplemented
	}
}
