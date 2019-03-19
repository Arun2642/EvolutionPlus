package evolv.io;
import java.util.Random;

public class Virus{
	private int brainSize = (Configuration.NUM_EYES * 3 + Configuration.MEMORY_COUNT + 6) * Configuration.BRAIN_WIDTH;
	public int targetReceptor = (int)Math.random() * brainSize + 1;
	public double receptorPreference = Math.random();
	public double dangerLevel = 0.1;
	private boolean exists = true;
	
	public Virus(Tile tile){
		tile.addVirusToTile(this);
	}
	
}
