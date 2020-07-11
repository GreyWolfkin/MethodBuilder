public class Sphere {

	private int index;
	private String name;
	private String color;
	private String desc;
	private String owner;
	private float radius;
	private float weight;
	private float density;
	private String material;
	private String texture;
	private float buoyancy;
	private float elasticity;

	public Sphere(int index, String name, String color, String desc, String owner, float radius, float weight, float density, String material, String texture, float buoyancy, float elasticity) {
		this.index = index;
		this.name = name;
		this.color = color;
		this.desc = desc;
		this.owner = owner;
		this.radius = radius;
		this.weight = weight;
		this.density = density;
		this.material = material;
		this.texture = texture;
		this.buoyancy = buoyancy;
		this.elasticity = elasticity;
	}

	public int getIndex() {
		return index;
	}
	public void setIndex(int set) {
		index = set;
	}

	public String getName() {
		return name;
	}
	public void setName(String set) {
		name = set;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String set) {
		color = set;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String set) {
		desc = set;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String set) {
		owner = set;
	}

	public float getRadius() {
		return radius;
	}
	public void setRadius(float set) {
		radius = set;
	}

	public float getWeight() {
		return weight;
	}
	public void setWeight(float set) {
		weight = set;
	}

	public float getDensity() {
		return density;
	}
	public void setDensity(float set) {
		density = set;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String set) {
		material = set;
	}

	public String getTexture() {
		return texture;
	}
	public void setTexture(String set) {
		texture = set;
	}

	public float getBuoyancy() {
		return buoyancy;
	}
	public void setBuoyancy(float set) {
		buoyancy = set;
	}

	public float getElasticity() {
		return elasticity;
	}
	public void setElasticity(float set) {
		elasticity = set;
	}

}
