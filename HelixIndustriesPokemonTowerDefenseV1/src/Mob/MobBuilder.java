package Mob;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MobBuilder {

	private final int spriteWidth = 20;
	private final int spriteHeight = 20;
	private final int spriteRows = 16;
	private final int spriteColumns = 7;
	private final int offset = 20;
	private BufferedImage[] mobSprites;
	public BufferedImage[] sprites;

	public MobBuilder() {
		mobSprites = cutMobSheet();
	}

	private BufferedImage[] cutMobSheet() {

		BufferedImage mobSpriteSheet = null;
		try {
			mobSpriteSheet = ImageIO.read(new File(
					"Images/CondensedOverworldSprites.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedImage pokemonSpriteSheet = null;
		try {
			pokemonSpriteSheet = ImageIO.read(new File(
					"Images/CondensedPokemonSprites.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedImage[] mobSprites = new BufferedImage[spriteRows
				* spriteColumns];
		System.out
				.println("Rows: " + spriteRows + " Columns: " + spriteColumns);
		for (int i = 0; i < spriteColumns; i++) {
			for (int j = 0; j < spriteRows; j++) {
				mobSprites[(i * spriteRows) + j] = mobSpriteSheet.getSubimage(j
						* spriteWidth, i * spriteHeight + offset, spriteWidth,
						spriteHeight);
				System.out.println(i * spriteRows + j + "," + i * spriteWidth
						+ "," + ((j * spriteHeight) + offset) + ","
						+ spriteWidth + "," + spriteHeight);
			}
		}

		sprites = new BufferedImage[spriteRows * spriteColumns];
		System.out
				.println("Rows: " + spriteRows + " Columns: " + spriteColumns);
		for (int i = 0; i < spriteColumns; i++) {
			for (int j = 0; j < spriteRows; j++) {
				sprites[(i * spriteRows) + j] = pokemonSpriteSheet.getSubimage(
						j * spriteWidth, i * spriteHeight + offset,
						spriteWidth, spriteHeight);
				System.out.println(i * spriteRows + j + "," + i * spriteWidth
						+ "," + ((j * spriteHeight) + offset) + ","
						+ spriteWidth + "," + spriteHeight);
			}
		}

		return mobSprites;
	}

	public Mob buildMob(MobID i) {

		Mob mob;

		switch (i) {

		case AERODACTYL:
			mob = new Aerodactyl(new BufferedImage[]{mobSprites[28], mobSprites[29], mobSprites[30], mobSprites[31], mobSprites[32], mobSprites[33]});
			break;

		case ALAKAZAM:
			mob = new Alakazam(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case ARBOK:
			mob = new Arbok(new BufferedImage[]{mobSprites[63], mobSprites[64], mobSprites[65], mobSprites[66], mobSprites[67], mobSprites[68]});
			break;

		case ARCANINE:
			
			mob = new Arcanine(new BufferedImage[]{mobSprites[7], mobSprites[8],mobSprites[9], mobSprites[10], mobSprites[11], mobSprites[12]});
			break;

		case ARTICUNO:
			mob = new Articuno(new BufferedImage[] {sprites[88], sprites[88], sprites[88],sprites[88],sprites[88], sprites[88]});
			break;

		case BELLSPROUT:
			mob = new Bellsprout(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case BLASTOISE:
			mob = new BlastoiseMob(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case CATERPIE:
			mob = new Caterpie(new BufferedImage[] {mobSprites[98], mobSprites[99], mobSprites[100], mobSprites[101], mobSprites[102], mobSprites[103]});
			break;

		case CHARIZARD:
			mob = new CharizardMob(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case CLOYSTER:
			mob = new Cloyster(new BufferedImage[]{mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case DEWGONG:
			mob = new Dewgong(new BufferedImage[]{mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case DIGLETT:
			mob = new Diglett(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case DODRIO:
			mob = new Dodrio(new BufferedImage[]{mobSprites[28], (mobSprites[29]), (mobSprites[30]), (mobSprites[31]), (mobSprites[32]), (mobSprites[33])});
			break;

		case DODUO:
			mob = new Doduo(new BufferedImage[]{mobSprites[28], (mobSprites[29]), (mobSprites[30]), (mobSprites[31]), (mobSprites[32]), (mobSprites[33])});
			break;

		case DRAGONAIR:
			mob = new Dragonair(new BufferedImage[]{mobSprites[63], mobSprites[64], mobSprites[65], mobSprites[66], mobSprites[67], mobSprites[68]});
			break;

		case DRAGONITE:
			mob = new Dragonite(new BufferedImage[]{mobSprites[63], mobSprites[64], mobSprites[65], mobSprites[66], mobSprites[67], mobSprites[68]});
			break;

		case DROWZEE:
			mob = new Drowzee(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case DUGTRIO:
			mob = new Dugtrio(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case EKANS:
			mob = new Ekans(new BufferedImage[]{mobSprites[63], mobSprites[64], mobSprites[65], mobSprites[66], mobSprites[67], mobSprites[68]});
			break;

		case ELITE_ALAKAZAM:
			mob = new EliteAlakazam(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case ELITE_ARBOK:
			mob = new EliteArbok(new BufferedImage[]{mobSprites[63], mobSprites[64], mobSprites[65], mobSprites[66], mobSprites[67], mobSprites[68]});
			break;

		case ELITE_EXEGGUTOR:
			mob = new EliteExeggutor(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case ELITE_HAUNTER:
			mob = new EliteHaunter(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case ELITE_ONIX:
			mob = new EliteOnix(new BufferedImage[]{mobSprites[63], mobSprites[64], mobSprites[65], mobSprites[66], mobSprites[67], mobSprites[68]});
			break;

		case ELITE_RHYDON:
			mob = new EliteRhydon(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case EXEGGCUTE:
			mob = new Exeggcute(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case FEAROW:
			mob = new Fearow(new BufferedImage[]{mobSprites[28], (mobSprites[29]), (mobSprites[30]), (mobSprites[31]), (mobSprites[32]), (mobSprites[33])});
			break;

		case GASTLY:
			mob = new Gastly(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case GENGAR:
			mob = new Gengar(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case GEODUDE:
			mob = new Geodude(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case GLOOM:
			mob = new Gloom(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case GOLBAT:
			mob = new Golbat(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case GOLDEEN:
			mob = new Goldeen(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case GOLDUCK:
			mob = new Golduck(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case GRAVELER:
			mob = new GravelerMob(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case GROWLITHE:
			mob = new Growlithe(new BufferedImage[]{mobSprites[7], mobSprites[8], mobSprites[9], mobSprites[10], mobSprites[11], mobSprites[12],});
			break;

		case GYARADOS:
			mob = new Gyarados(new BufferedImage[]{mobSprites[63], mobSprites[64], mobSprites[65], mobSprites[66], mobSprites[67], mobSprites[68]});
			break;

		case HAUNTER:
			mob = new Haunter(new BufferedImage[]{mobSprites[7], mobSprites[8], mobSprites[9], mobSprites[10], mobSprites[11], mobSprites[12],});
			break;

		case HITMONCHAN:
			mob = new Hitmonchan(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case HITMONLEE:
			mob = new Hitmonlee(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case HORSEA:
			mob = new Horsea(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case HYPNO:
			mob = new Hypno(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case JIGGLYPUFF:
			mob = new Jigglypuff(new BufferedImage[]{mobSprites[7], mobSprites[8], mobSprites[9], mobSprites[10], mobSprites[11], mobSprites[12],});
			break;

		case JYNX:
			mob = new Jynx(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case KADABRA:
			mob = new Kadabra(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case KINGLER:
			mob = new Kingler(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case KOFFING:
			mob = new Koffing(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case LAPRAS:
			mob = new Lapras(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case LICKITUNG:
			mob = new Lickitung(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case MACHAMP:
			mob = new Machamp(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case MACHOKE:
			mob = new Machoke(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case MACHOP:
			mob = new Machop(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case MAGNEMITE:
			mob = new Magnemite(new BufferedImage[]{mobSprites[35], mobSprites[36], mobSprites[37], mobSprites[38], mobSprites[39], mobSprites[40]});
			break;

		case MANKEY:
			mob = new Mankey(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case MAROWAK:
			mob = new Marowak(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case MEOWTH:
			mob = new Meowth(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case MOLTRES:
			mob = new Moltres(new BufferedImage [] {sprites[91], sprites[91], sprites[91], sprites[91], sprites[91], sprites[91]});
			break;

		case MRMIME:
			mob = new MrMime(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case MUK:
			mob = new Muk(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case NIDOKING:
			mob = new Nidoking(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case NIDORINO:
			mob = new Nidorino(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case NINETALES:
			mob = new Ninetales(new BufferedImage[]{mobSprites[7], mobSprites[8], mobSprites[9], mobSprites[10], mobSprites[11], mobSprites[12],});
			break;

		case ODDISH:
			mob = new Oddish(new BufferedImage[]{mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case ONIX:
			mob = new Onix(new BufferedImage[]{mobSprites[63], mobSprites[64], mobSprites[65], mobSprites[66], mobSprites[67], mobSprites[68]});
			break;

		case PARASECT:
			mob = new Parasect(new BufferedImage[] {mobSprites[98], mobSprites[99], mobSprites[100], mobSprites[101], mobSprites[102], mobSprites[103]});
			break;

		case PIDGEOT:
			mob = new Pidgeot(new BufferedImage[]{mobSprites[28], (mobSprites[29]), (mobSprites[30]), (mobSprites[31]), (mobSprites[32]), (mobSprites[33])});
			break;

		case PIDGEOTTO:
			mob = new Pidgeotto(new BufferedImage[]{mobSprites[28], (mobSprites[29]), (mobSprites[30]), (mobSprites[31]), (mobSprites[32]), (mobSprites[33])});
			break;

		case PIDGEY:
			mob = new Pidgey(new BufferedImage[]{mobSprites[28], (mobSprites[29]), (mobSprites[30]), (mobSprites[31]), (mobSprites[32]), (mobSprites[33])});
			break;

		case PIKACHU:
			mob = new PikachuMob(new BufferedImage[]{mobSprites[35], mobSprites[36], mobSprites[37], mobSprites[38], mobSprites[39], mobSprites[40]});
			break;

		case POLIWAG:
			mob = new Poliwag(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case PONYTA:
			mob = new Ponyta(new BufferedImage[] {mobSprites[49], mobSprites[50], mobSprites[51], mobSprites[52], mobSprites[53], mobSprites[54]});
			break;

		case PSYDUCK:
			mob = new Psyduck(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case RAICHU:
			mob = new RaichuMob(new BufferedImage[]{mobSprites[35], mobSprites[36], mobSprites[37], mobSprites[38], mobSprites[39], mobSprites[40]});
			break;

		case RAPIDASH:
			mob = new Rapidash(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case RATICATE:
			mob = new Raticate(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case RATTATA:
			mob = new Rattata (new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case RHYDON:
			mob = new Rhydon(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case RHYHORN:
			mob = new Rhyhorn(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case SANDSHREW:
			mob = new Sandshrew(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case SEEL:
			mob = new Seel(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case SHELLDER:
			mob = new Shellder(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case SLOWBRO:
			mob = new Slowbro(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case SLOWPOKE:
			mob = new Slowpoke(new BufferedImage[]{mobSprites[7], mobSprites[8], mobSprites[9], mobSprites[10], mobSprites[11], mobSprites[12]});
			break;

		case SNORLAX:
			mob = new Snorlax(new BufferedImage[] {sprites[88],sprites[88],sprites[88],sprites[88],sprites[88],sprites[88]});
			break;

		case SPEAROW:
			mob = new Spearow(new BufferedImage[]{mobSprites[28], (mobSprites[29]), (mobSprites[30]), (mobSprites[31]), (mobSprites[32]), (mobSprites[33])});
			break;

		case STARMIE:
			mob = new Starmie(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case STARYU:
			mob = new Staryu(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case TANGELA:
			mob = new Tangela(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case TAUROS:
			mob = new Tauros(new BufferedImage[]{mobSprites[49], mobSprites[50], mobSprites[51], mobSprites[52], mobSprites[53], mobSprites[54]});
			break;

		case TENTACOOL:
			mob = new Tentacool(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case TENTACRUEL:
			mob = new Tentacruel(new BufferedImage[] {mobSprites[14], mobSprites[15], mobSprites[16], mobSprites[17], mobSprites[18], mobSprites[19]});
			break;

		case VENONAT:
			mob = new Venonat(new BufferedImage[] {mobSprites[98], mobSprites[99], mobSprites[100], mobSprites[101], mobSprites[102], mobSprites[103]});
			break;

		case VENOMOTH:
			mob = new Venonat(new BufferedImage[] {mobSprites[98], mobSprites[99], mobSprites[100], mobSprites[101], mobSprites[102], mobSprites[103]});
			break;

		case VENASAUR:
			mob = new VenusaurMob(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case VICTREEBELL:
			mob = new Victreebell(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case VILEPLUME:
			mob = new Vileplume(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[60], mobSprites[61]});
			break;

		case VOLTORB:
			mob = new Voltorb(new BufferedImage[] {mobSprites[35], mobSprites[36], mobSprites[37], mobSprites[38], mobSprites[39], mobSprites[40]});
			break;

		case VULPIX:
			mob = new Vulpix(new BufferedImage[]{mobSprites[7], mobSprites[8], mobSprites[9], mobSprites[10], mobSprites[11], mobSprites[12]});
			break;

		case WEEDLE:
			mob = new Weedle(new BufferedImage[] {mobSprites[98], mobSprites[99], mobSprites[100], mobSprites[101], mobSprites[102], mobSprites[103]});
			break;

		case WEEPINBELL:
			mob = new Weepinbell(new BufferedImage[] {mobSprites[56], mobSprites[57], mobSprites[58], mobSprites[59], mobSprites[50], mobSprites[61]});
			break;

		case WEEZING:
			mob = new Weezing(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		case ZAPDOS:
			mob = new Zapdos(new BufferedImage[]{mobSprites[28], (mobSprites[29]), (mobSprites[30]), (mobSprites[31]), (mobSprites[32]), (mobSprites[33])});
			break;

		case ZUBAT:
			mob = new Zubat(new BufferedImage[]{mobSprites[21], mobSprites[22], mobSprites[23], mobSprites[24], mobSprites[25], mobSprites[26]});
			break;

		default:
			mob = null;
			break;

		}

		return mob;
	}
}
