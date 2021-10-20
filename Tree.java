class Tree {

private String treeName;
private String treeType;
private boolean leavesFall;
private String leafColor;

Tree() {
  treeName = "";
  treeType = "";
  leavesFall = false;
  leafColor = "";
}

Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor){
treeName = aTreeName;
treeType = aTreeType;
leavesFall = aLeavesFall;
leafColor = aLeafColor;
}

void setName(String aTreeName) {
  treeName = aTreeName;
}

void setType(String aTreeType){
  treeType = aTreeType;
}

void setFall(boolean aLeavesFall){
  leavesFall = aLeavesFall;
}

void setColor(String aLeafColor){
  leafColor = aLeafColor;
}

String getName() {
  return treeName;
}

String getType() {
  return treeType;
}

boolean getFall() {
  return leavesFall;
}

String getColor() {
  return leafColor;
}

void print() {

  String fall = "does not";
  if(getFall() == true) {
    fall = "does";
  }
  
System.out.println("This is a " + getName() + " tree. It is a " + getType() + " and its leaves are currently " + getColor() + ". It " + fall + " lose its leaves for the winter.");
}

}