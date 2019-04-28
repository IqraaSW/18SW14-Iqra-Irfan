public class AddMatrix{
public static void main(String args[]){
int i[][]={{1,2,3},{4,5,6},{7,8,9}};
int j[][]={{1,2,4},{5,6,9},{2,4,5}};
int k[][]=new int[3][3];
for(int x=0;x<3;x++){
for(int y=0;y<3;y++){
k[x][y]=i[x][y]+j[x][y];
System.out.print(k[x][y]+ " ");
}
System.out.println();
}
}
}

