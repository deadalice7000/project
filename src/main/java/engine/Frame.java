package engine;

public class Frame {

	private int length;
	private Sprite sprite;
	private int numberDisplayed;

	public Frame(Sprite sprite, int length) {
		this.sprite = sprite;
		this.length = length;
		numberDisplayed = 0;

	}

	public boolean render() {
		sprite.render();
		numberDisplayed++;

		if (numberDisplayed >= length) {
			numberDisplayed = 0;
			return true;
		}
		return false;

	}

}
