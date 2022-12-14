package in.co.IO;
import java.io.Serializable;

public class SerializableMarksheet implements Serializable {
String name;
int maths;
int physics;
int chemistry;
private transient String tempValue;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMaths() {
	return maths;
}

public void setMaths(int maths) {
	this.maths = maths;
}

public int getPhysics() {
	return physics;
}

public void setPhysics(int physics) {
	this.physics = physics;
}

public int getChemistry() {
	return chemistry;
}

public void setChemistry(int chemistry) {
	this.chemistry = chemistry;
}

public String getTempValue() {
	return tempValue;
}

public void setTempValue(String tempValue) {
	this.tempValue = tempValue;
}
}
