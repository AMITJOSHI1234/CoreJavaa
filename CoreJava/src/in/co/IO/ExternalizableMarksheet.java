package in.co.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableMarksheet implements Externalizable {
transient int temp;
String name;
int maths;
int physics;
int chemistry;

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

public int getTemp() {
	return temp;
}

public void setTemp(int temp) {
	this.temp = temp;
}

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(name);
	out.writeInt(physics);
	out.writeInt(maths);
	out.writeInt(chemistry);
	out.writeInt(temp);
}

@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	name = (String) in.readObject();
	physics = in.readInt();
	maths = in.readInt();
	chemistry = in.readInt();
	temp = in.readInt();
	
	
}
}
