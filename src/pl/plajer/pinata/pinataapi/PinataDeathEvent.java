package pl.plajer.pinata.pinataapi;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

/**
 * Called when pinata is killed.
 */
public class PinataDeathEvent extends Event {

	private final Player killer;
	private final Sheep pinata;
	private final ArrayList<ItemStack[]> drops;
	private static final HandlerList HANDLERS = new HandlerList();

	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS;
	}

	public PinataDeathEvent(Player killer, Sheep pinata, ArrayList<ItemStack[]> drops) {
		this.killer = killer;
		this.pinata = pinata;
		this.drops = drops;
	}

	/**
	 * @return killer of pinata.
	 */
	public Player getKiller() {
		return this.killer;
	}

	/**
	 * @return killed pinata.
	 */
	public Sheep getPinata() {
		return this.pinata;
	}

	/**
	 * <b>Warning! getDrops() doesn't return command, gun, money drops! TODO in future versions.</b>
	 * @return drops from pinata.
	 * @since 2.1.3
	 */
	public ArrayList<ItemStack[]> getDrops(){
		return this.drops;
	}
}