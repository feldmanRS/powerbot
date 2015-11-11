package org.powerbot.script.rt6;

/**
 * {@inheritDoc}
 */
public class GeItem extends org.powerbot.script.GeItem {

	/**
	 * {@inheritDoc}
	 */
	public GeItem(final int id) {
		super("rs", id);
	}

	/**
	 * Returns the spot (current) price for an item.
	 *
	 * @param id the item ID
	 * @return the quote or {@code -1} if none was found
	 * @deprecated use {@link org.powerbot.script.GeItem#price} instead
	 */
	@Deprecated
	public static int price(final int id) {
		final GeItem x = new GeItem(id);
		return x.id == 0 ? -1 : x.price;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.powerbot.script.GeItem nil() {
		return new GeItem(0);
	}
}