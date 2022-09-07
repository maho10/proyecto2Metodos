

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class Funciones {
    public static void decir(String a) {
        JOptionPane.showMessageDialog(null, a);
    }

    public static int fraccion(String a){
        int devolver=-1;
        for(int i=0;i<a.length();i++){
            if((a.charAt(i)+"").equals("/")){
                if(devolver==-1&&i!=0&&i!=a.length()-1){
                    devolver=i;
                }else{
                    devolver=-1;
                    i=a.length();
                }
            }else{
                if(i==0&&(a.charAt(i)+"").equals("-")){
                    
                }else{
                    try{
                        int p=Integer.parseInt(a.charAt(i)+"");
                        if(devolver!=-1&&devolver==a.length()-2&&p==0){
                            devolver=-1;
                            i=a.length();
                        }
                    }catch (Exception e) {
                        devolver=-1;
                        i=a.length();
                    }
                }
            }
        }
        return devolver;
    }
    
    public static BigInteger MCD(BigInteger a, BigInteger b) {
        BigInteger mcd = a;
        if (a != b) {
            if (a != BigInteger.valueOf(0)) {
                if (b != BigInteger.valueOf(0)) {
                    if (a.compareTo(BigInteger.valueOf(0))==-1) {
                        a = a.multiply(BigInteger.valueOf(-1));
                    }
                    if (b.compareTo(BigInteger.valueOf(0))==-1) {
                        b = b.multiply(BigInteger.valueOf(-1));
                    }
                    if (a.compareTo(b)==-1) {
                        BigInteger c = a;
                        a = b;
                        b = c;
                    }
                    mcd = a;
                    do {
                        BigInteger k = mcd.mod(b);
                        mcd = b;
                        b = k;
                    } while (b !=BigInteger.valueOf(0));
                } else {
                    mcd = a;
                }
            } else {
                mcd = b;
            }
        } else {
            mcd = a;
        }
        if (mcd ==BigInteger.valueOf(0)) {
            mcd =BigInteger.valueOf(1);
        }
        return mcd;
    }
    
    public static String tamano(int a){
        String r="";
        for (int i=0;i<a-1;i++){
                r=r+"c";
        }
        r=r+"l";
        return r;
    }
	
    public static String imprimir(BigInteger[][][] a,int b,boolean latex) {
        String todo = "";
        if (latex == false) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length - 1; j++) {
                    if (a[i][j][1].compareTo(BigInteger.valueOf( 1))==0) {
                        if(j!=b){
                            todo = todo + (a[i][j][0] + " ");
                        }else{
                            todo = todo +"|"+ (a[i][j][0] + " ");
                        }
                    } else {
                        if(j!=b){
                            todo = todo + (a[i][j][0] + "/" + a[i][j][1] + " ");
                        }else{
                            todo = todo +"|"+ (a[i][j][0] + "/" + a[i][j][1] + " ");
                        }
                    }
                }
                if (a[i][a[0].length - 1][1].compareTo(BigInteger.valueOf(1))==0 ) {
                    if((a[0].length - 1)!=b){
                        todo = todo + (a[i][a[0].length - 1][0] + "\n");
                    }else{
                        todo = todo +"|"+ (a[i][a[0].length - 1][0] + "\n");
                    }
                } else {
                    if((a[0].length - 1)!=b){
                        todo = todo + (a[i][a[0].length - 1][0] + "/" + a[i][a[0].length - 1][1] + "\n");
                    }else{
                        todo = todo +"|"+ (a[i][a[0].length - 1][0] + "/" + a[i][a[0].length - 1][1] + "\n");
                    }
                }
            }
        } else {
            todo = "\\[\\left[\\begin{tabular}{c"+tamano(b)+"}\n";
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length - 1; j++) {
                    if (a[i][j][1].compareTo(BigInteger.valueOf( 1))==0) {
                        if(j!=b){
                            todo = todo + (a[i][j][0] + "&");
                        }else{
                            todo = todo +"|"+ (a[i][j][0] + "&");
                        }
                    } else {
                        if(j!=b){
                            todo = todo + (a[i][j][0] + "/" + a[i][j][1] + "&");
                        }else{
                            todo = todo +"|"+ (a[i][j][0] + "/" + a[i][j][1] + "&");
                        }
                    }
                }
                if (a[i][a[0].length - 1][1].compareTo(BigInteger.valueOf(1))==0 ) {
                    if((a[0].length - 1)!=b){
                        todo = todo + (a[i][a[0].length - 1][0] + "\\\\\n");
                    }else{
                        todo = todo +"|"+ (a[i][a[0].length - 1][0] + "\\\\\n");
                    }
                } else {
                    if((a[0].length - 1)!=b){
                        todo = todo + (a[i][a[0].length - 1][0] + "/" + a[i][a[0].length - 1][1] + "\\\\\n");
                    }else{
                        todo = todo +"|"+ (a[i][a[0].length - 1][0] + "/" + a[i][a[0].length - 1][1] + "\\\\\n");
                    }
                }
            }
            todo = todo + "\\end{tabular}\\right]\\]\n";
        }
        return todo;
    }
	
    public static BigInteger[][][] IngresarMatriz(int m, int n) {
        BigInteger[][][] matriz1 = new BigInteger[0][0][2];
        if (m <= 0) {
            JOptionPane.showMessageDialog(null, "las filas solo pueden ser positivas");
        } else {
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "las columnas solo pueden ser positivas");
            } else {
                String forma = ("dado una matriz de la forma:\n");
                for (int i = 1; i < m + 1; i++) {
                    for (int j = 1; j < n; j++) {
                        forma = forma + ("(" + i + "," + j + ")");
                    }
                    forma = forma + ("(" + i + "," + n + ")\n");
                }
                matriz1 = new BigInteger[m][n][2];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        matriz1[i][j][1] = BigInteger.valueOf(1);
                    }
                }
                for (int i = 1; i < m + 1; i++) {
                    for (int j = 1; j < n + 1; j++) {
                        boolean verificador = false;
                        boolean numero=false;
                        double a = 0;
                        String respuesta="";
                        do {
                            try {
                                respuesta=JOptionPane.showInputDialog(forma + "\n ingrese el valor de (" + i + "," + j + ")");
                                a = Double.parseDouble(respuesta);
                                numero= true;
                                verificador = true;
                            } catch (Exception e) {
                                int posicion=fraccion(respuesta);
                                if(posicion==-1){
                                    decir("ese no es un numero");
                                }else{
                                    verificador=true;
                                    String sNumerador="";
                                    String sDenominador="";
                                    for(int z=0;z<respuesta.length();z++){
                                        if(z<posicion){
                                            sNumerador=sNumerador+respuesta.charAt(z);
                                        }else if(z>posicion){
                                            sDenominador=sDenominador+respuesta.charAt(z);
                                        }
                                    }
                                    BigInteger b=BigInteger.valueOf(Long.parseLong(sNumerador));
                                    BigInteger c=BigInteger.valueOf(Long.parseLong(sDenominador));
                                    BigInteger mcd= MCD(b,c);
                                    matriz1[i - 1][j - 1][0]=b.divide(mcd);
                                    matriz1[i - 1][j - 1][1]=c.divide(mcd);
                                }
                            }
                        } while (verificador == false);
                        if(numero==true){
                            if (((long) a) == a) {
                                matriz1[i - 1][j - 1][0] = BigInteger.valueOf((long) a);
                            } else {
                                int punto = -1;
                                String numeroSinPunto = "";
                                for (int k = 0; k < (a + "").length(); k++) {
                                    if (((a + "").charAt(k) + "").equals(".")) {
                                        punto = k;
                                    } else {
                                        numeroSinPunto = numeroSinPunto + (a + "").charAt(k);
                                    }
                                }
                                BigInteger g =BigInteger.valueOf((long) Math.pow(10, (((numeroSinPunto) + "").length() - punto)));
                                BigInteger d=BigInteger.valueOf(Long.parseLong(numeroSinPunto));
                                BigInteger mcd = MCD(d, g);
                                matriz1[i - 1][j - 1][0] = d.divide(mcd);
                                matriz1[i - 1][j - 1][1] = g.divide(mcd);
                            }
                        }
                    }
                }
            }
        }
        return matriz1;
    }
    
    public static BigInteger[][][] EditarMatriz(BigInteger[][][] matriz) {
        boolean verificador=false;
        int fila=-1;
        int columna=-1;
        BigInteger numerador;
        BigInteger denominador;
        int m =matriz.length;
        int n =matriz[0].length;
        String forma = ("dado una matriz de la forma:\n");
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n; j++) {
                forma = forma + ("(" + i + "," + j + ")");
            }
            forma = forma + ("(" + i + "," + n + ")\n");
        }
        while (verificador==false){
            String respuesta=JOptionPane.showInputDialog(forma + "\n Ingrese la Fila que desea editar");
            try{
                fila=Integer.parseInt(respuesta);
                if (fila<0){
                    JOptionPane.showMessageDialog(null, "no hay filas negativas");
                }else{
                    if (fila>m){
                        JOptionPane.showMessageDialog(null, "no hay filas mayores que "+(m));
                    }else{
                        verificador=true;
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "la cantidad de filas es un numero entero");
            }
        }
        verificador=false;
        while (verificador==false){
            String respuesta=JOptionPane.showInputDialog(forma + "\n Ingrese la columna que desea editar");
            try{
                columna=Integer.parseInt(respuesta);
                if (columna<0){
                    JOptionPane.showMessageDialog(null, "no hay columna negativas");
                }else{
                    if (columna>n){
                        JOptionPane.showMessageDialog(null, "no hay columna mayores que "+(n));
                    }else{
                        verificador=true;
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "la cantidad de columnas es un numero entero");
            }
        }
        boolean numero=false;
        double a=0.0;
        do {
            String respuesta="";
            try {
                respuesta=JOptionPane.showInputDialog("\n ingrese el valor ");
                a = Double.parseDouble(respuesta);
                verificador = true;
                numero=true;
            } catch (Exception e) {
                int posicion=fraccion(respuesta);
                if(posicion==-1){
                    decir("ese no es un numero");
                }else{
                    verificador=true;
                    String sNumerador="";
                    String sDenominador="";
                    for(int z=0;z<respuesta.length();z++){
                        if(z<posicion){
                            sNumerador=sNumerador+respuesta.charAt(z);
                        }else if(z>posicion){
                            sDenominador=sDenominador+respuesta.charAt(z);
                        }
                    }
                    BigInteger b=BigInteger.valueOf(Long.parseLong(sNumerador));
                    BigInteger c=BigInteger.valueOf(Long.parseLong(sDenominador));
                    BigInteger mcd= MCD(b,c);
                    matriz[fila - 1][columna - 1][0]=b.divide(mcd);
                    matriz[fila - 1][columna - 1][1]=c.divide(mcd);
                }
            }
        } while (verificador == false);
        if(numero==true){
            if (((long) a) == a) {
                matriz[fila - 1][columna - 1][0] = BigInteger.valueOf((long) a);
            } else {
                int punto = -1;
                String numeroSinPunto = "";
                for (int k = 0; k < (a + "").length(); k++) {
                    if (((a + "").charAt(k) + "").equals(".")) {
                        punto = k;
                    } else {
                        numeroSinPunto = numeroSinPunto + (a + "").charAt(k);
                    }
                }
                BigInteger g =BigInteger.valueOf((long) Math.pow(10, (((numeroSinPunto) + "").length() - punto)));
                BigInteger d=BigInteger.valueOf(Long.parseLong(numeroSinPunto));
                BigInteger mcd = MCD(d, g);
                matriz[fila - 1][columna - 1][0] = d.divide(mcd);
                matriz[fila - 1][columna - 1][1] = g.divide(mcd);
            }
        }
        
        return matriz;
    }
    
    public static String imprimirdet(BigInteger[][][] a,int b) {
        String todo = "";
        todo = "\\left[\\begin{tabular}{"+tamano(b)+"}\n";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length - 1; j++) {
                if (a[i][j][1].compareTo(BigInteger.valueOf(1))==0) {
                    if(j!=b){
                        todo = todo + (a[i][j][0] + "&");
                    }else{
                        todo = todo +"|"+ (a[i][j][0] + "&");
                    }
                } else {
                    if(j!=b){
                        todo = todo + (a[i][j][0] + "/" + a[i][j][1] + "&");
                    }else{
                        todo = todo +"|"+ (a[i][j][0] + "/" + a[i][j][1] + "&");
                    }
                }
            }
            if (a[i][a[0].length - 1][1].compareTo(BigInteger.valueOf(1))==0) {
                if((a[0].length - 1)!=b){
                    todo = todo + (a[i][a[0].length - 1][0] + "\\\\\n");
                }else{
                    todo = todo +"|"+ (a[i][a[0].length - 1][0] + "\\\\\n");
                }
            } else {
                if((a[0].length - 1)!=b){
                    todo = todo + a[i][a[0].length - 1][0] + "/" + a[i][a[0].length - 1][1] + "\\\\\n";
                }else{
                    todo = todo +"|"+ a[i][a[0].length - 1][0] + "/" + a[i][a[0].length - 1][1] + "\\\\\n";
                }
            }
        }
        todo = todo + "\\end{tabular}\\right]";

        return todo;
    }                                        

    public static BigInteger[] inversos;
    
    public static BigInteger buscarInverso(BigInteger A,long[] indices,int modulo) {
        //decir(a+"");
        boolean salir = false;
        BigInteger inver = BigInteger.valueOf(-1);
        int a=A.intValue();
        if (A.compareTo(BigInteger.valueOf(0)) != 0) {
            if (A.compareTo(BigInteger.valueOf(1)) == 0) {
                inver = BigInteger.valueOf(1);
            } else {
                if (indices[a- 1] != -2) {
                    inver = inversos[a - 1];
                } else {
                    //decir("hola");
                    long primero = ((a * ((int) (modulo / a) - 1)) + modulo) % modulo;
                    //decir(primero+"");
                    long contador = (int) (modulo / a) - 1;
                    boolean verificador = true;
                    do {
                        contador++;
                        //decir("p="+(((a*contador)+modulo)%modulo));
                        if (((((a * contador) + modulo) % modulo) == primero)) {
                            verificador = false;
                        }
                        if (((((a * contador) + modulo) % modulo) == 1)) {
                            salir = true;
                        }
                        if (verificador == false) {
                            salir = true;
                        }
                    } while (salir == false);
                    if (verificador == false) {
                        inversos[(int)a - 1] = BigInteger.valueOf(-1);
                    } else {
                        inversos[(int)a - 1] = BigInteger.valueOf(contador);
                        inver = BigInteger.valueOf(contador);
                    }
                }
            }
        }
        //decir(inver+"");
        return inver;
    }
    
    public static BigInteger[][][] VectorGauss=new BigInteger[0][0][2];
    
    public static String GaussJordan(BigInteger matriz1[][][],BigInteger  matriz2[][][],String modulos,int modulo) {                                        
        // TODO add your handling code here:
        String todo="";
        BigInteger Modulo=BigInteger.valueOf(modulo);
        boolean verificador = false;
        try {
            BigInteger a = matriz1[0][0][0];
            a = matriz2[0][0][0];
            verificador = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debes de ingresar ambas matrizes primero");
        }
        if (verificador == true) {
            int mA = matriz1.length;
            int nA = matriz1[0].length;
            int mB = matriz2.length;
            int nB = matriz2[0].length;
            if (mA != mB) {
                decir("las matrices tienen que tener la misma cantidad de filas");
            } else {
                BigInteger matriz[][][] = new BigInteger[mA][nA + nB][2];
                for (int i = 0; i < mA; i++) {
                    for (int j = 0; j < (nA); j++) {
                        matriz[i][j][0] = matriz1[i][j][0];
                        matriz[i][j][1] = matriz1[i][j][1];
                    }
                }
                for (int i = 0; i < mA; i++) {
                    for (int j = 0; j < (nB); j++) {
                        matriz[i][nA + j][0] = matriz2[i][j][0];
                        matriz[i][nA + j][1] = matriz2[i][j][1];
                    }
                }
                if (modulos.equals("no")){
                    todo = ("\nLa matris resultante es,\n");
                    todo = todo + imprimir(matriz,nA,true);
                    BigInteger mcd = BigInteger.valueOf(0);
                    boolean verificador2 = true;
                    for (int i = 0; i < mA - 1; i++) {
                        BigInteger[] clave = new BigInteger[2];
                        clave[0] = matriz[i][i][0];
                        clave[1] = matriz[i][i][1];
                        if (clave[0] != BigInteger.valueOf(0)) {
                            verificador2 = false;
                            for (int j = i; j < (nA + nB); j++) {
                                matriz[i][j][0] = matriz[i][j][0].multiply( clave[1]);
                                matriz[i][j][1] = matriz[i][j][1].multiply( clave[0]);
                                mcd = MCD(matriz[i][j][0], matriz[i][j][1]);
                                matriz[i][j][0] = matriz[i][j][0].divide( mcd);
                                matriz[i][j][1] = matriz[i][j][1].divide(mcd);
                                if (matriz[i][j][1].compareTo(BigInteger.valueOf(1))==-1) {
                                    matriz[i][j][0] = matriz[i][j][0].multiply( BigInteger.valueOf( -1));
                                    matriz[i][j][1] = matriz[i][j][1].multiply( BigInteger.valueOf( -1));
                                }
                            }
                            if (clave[0] !=BigInteger.valueOf(1) || clave[1] !=BigInteger.valueOf(1)) {
                                if (clave[1] ==BigInteger.valueOf(1)) {
                                    todo = todo + ("$\\Rightarrow$ dividimos la fila " + (i + 1) + " dentro de " + clave[0] + "\n");
                                } else {
                                    todo = todo + ("$\\Rightarrow$ dividimos la fila " + (i + 1) + " dentro de $\\frac{" + clave[0] + "}{" + clave[1] + "}$\n");
                                }
                                todo = todo + imprimir(matriz,nA,true);
                            }
                            for (int j = i + 1; j < mA; j++) {
                                clave[0] = matriz[j][i][0];
                                clave[1] = matriz[j][i][1];
                                for (int k = i; k < (nA + nB); k++) {
                                    matriz[j][k][0] = (matriz[j][k][0].multiply(clave[1].multiply( matriz[i][k][1]))).subtract((clave[0].multiply( matriz[i][k][0].multiply( matriz[j][k][1]))));
                                    matriz[j][k][1] = matriz[j][k][1].multiply( clave[1].multiply( matriz[i][k][1]));
                                    mcd = MCD(matriz[j][k][0], matriz[j][k][1]);
                                    matriz[j][k][0] = matriz[j][k][0].divide(mcd);
                                    matriz[j][k][1] = matriz[j][k][1].divide(mcd);
                                    if (matriz[j][k][1].compareTo(BigInteger.valueOf(0))==-1) {
                                        matriz[j][k][0] = matriz[j][k][0].multiply(BigInteger.valueOf(-1));
                                        matriz[j][k][1] = matriz[j][k][1].multiply(BigInteger.valueOf(-1));
                                    }
                                }
                                if (clave[0]!=BigInteger.valueOf(0)){
                                    if (clave[1] == BigInteger.valueOf(1)) {
                                        todo = todo + ("$\\Rightarrow$ restamos " + clave[0] + " veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                                    } else {
                                        todo = todo + ("$\\Rightarrow$ restamos $\\frac{" + clave[0] + "}{" + clave[1] + "}$ veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                                    }
                                    todo = todo + imprimir(matriz,nA,true);
                                }
                            }
                        } else {
                            for (int j = i; j < mA; j++) {
                                if (matriz[j][i][0] != BigInteger.valueOf(0)) {
                                    for (int k = 0; k < (nA + nB); k++) {
                                        BigInteger t = matriz[i][k][0];
                                        BigInteger u = matriz[i][k][1];
                                        matriz[i][k][0] = matriz[j][k][0];
                                        matriz[i][k][1] = matriz[j][k][1];
                                        matriz[j][k][0] = t;
                                        matriz[j][k][1] = u;
                                    }
                                    todo = todo + ("$\\Rightarrow$ intercambiamos la fila " + ((int) i + 1) + " con la fila " + (j + 1) + "\n");
                                    todo = todo + imprimir(matriz,nA,true);
                                    j = mA;
                                    i--;
                                    verificador2 = false;
                                }
                            }
                            if (verificador2 == true) {
                                i = mA;
                            }
                        }
                    }
                    BigInteger bla0 = matriz[mA - 1][nA - 1][0];
                    BigInteger bla1 = matriz[mA - 1][nA - 1][1];
                    //decir(verificador2+"   "+bla);
                    if (verificador2 == false && bla0 != BigInteger.valueOf(0)) {
                        bla0 = matriz[mA - 1][mA - 1][0];
                        bla1 = matriz[mA - 1][mA - 1][1];
                        for (int i = 0; i < nB; i++) {
                            matriz[mA - 1][nA + i][0] = matriz[mA - 1][nA + i][0].multiply(bla1);
                            matriz[mA - 1][nA + i][1] = matriz[mA - 1][nA + i][1].multiply(bla0);
                            mcd = MCD(matriz[mA - 1][nA + i][1], matriz[mA - 1][nA + i][0]);
                            matriz[mA - 1][nA + i][0] = matriz[mA - 1][nA + i][0].divide(mcd);
                            matriz[mA - 1][nA + i][1] = matriz[mA - 1][nA + i][1].divide(mcd);
                            if (matriz[mA - 1][nA + i][1].compareTo(BigInteger.valueOf(0))==-1) {
                                matriz[mA - 1][nA + i][0] = matriz[mA - 1][nA + i][0].multiply(BigInteger.valueOf(-1));
                                matriz[mA - 1][nA + i][1] = matriz[mA - 1][nA + i][1].multiply(BigInteger.valueOf(-1));
                            }
                        }
                        matriz[mA - 1][mA - 1][0] = BigInteger.valueOf(1);
                        matriz[mA - 1][mA - 1][1] = BigInteger.valueOf(1);
                        if (bla1 == BigInteger.valueOf(1)) {
                            todo = todo + ("$\\Rightarrow$ dividimos la fila " + (mA) + " dentro de " + bla0 + "\n");
                        } else {
                            todo = todo + ("$\\Rightarrow$ dividimos la fila " + (mA) + " dentro de $\\frac{" + bla0 + "}{" + bla1 + "}$\n");
                        }
                        todo = todo + imprimir(matriz,nA,true);
                        for (int i = mA - 1; i > 0; i--) {
                            for (int j = i - 1; j >= 0; j--) {
                                BigInteger clave[] = new BigInteger[2];
                                clave[0] = matriz[j][i][0];
                                clave[1] = matriz[j][i][1];
                                for (int k = i; k < (nA + nB); k++) {
                                    matriz[j][k][0] = (matriz[j][k][0].multiply( matriz[i][k][1].multiply(clave[1])).subtract((matriz[i][k][0].multiply( clave[0].multiply( matriz[j][k][1])))));
                                    matriz[j][k][1] = matriz[j][k][1].multiply( matriz[i][k][1].multiply( clave[1]));
                                    mcd = MCD(matriz[j][k][0], matriz[j][k][1]);
                                    matriz[j][k][0] = matriz[j][k][0].divide(mcd);
                                    matriz[j][k][1] = matriz[j][k][1].divide(mcd);
                                    if (matriz[j][k][1].compareTo(BigInteger.valueOf(1))==-1) {
                                        matriz[j][k][0] = matriz[j][k][0].multiply( BigInteger.valueOf(-1));
                                        matriz[j][k][1] = matriz[j][k][1].multiply( BigInteger.valueOf(-1));
                                    }
                                }
                                if (clave[0]!=BigInteger.valueOf(0)){
                                    if (clave[1] == BigInteger.valueOf(1)) {
                                        todo = todo + ("$\\Rightarrow$ restamos " + clave[0] + " veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                                    } else {
                                        todo = todo + ("$\\Rightarrow$ restamos $\\frac{" + clave[0] + "}{" + clave[1] + "}$ veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                                    }
                                    todo = todo + imprimir(matriz,nA,true);
                                }
                            }
                        }
                        BigInteger respuesta[][][]=new BigInteger[nA][1][2];
                        if(mA==nA){
                            todo = todo + "\\[\\therefore \\begin{bmatrix}\n";
                            for (int i = 0; i < mA; i++) {
                                for (int j = 0; j < nB-1; j++) {
                                    if (matriz[i][nA+j][1].compareTo(BigInteger.valueOf(1))==0) {
                                        todo = todo + matriz[i][nA+j][0] + "&";
                                        respuesta[i][0][0]=matriz[i][nA+j][0];
                                        respuesta[i][0][1]=BigInteger.valueOf(1);
                                    } else {
                                        todo = todo + matriz[i][nA+j][0] + "/" + matriz[i][nA+j][1] + "&";
                                        respuesta[i][0][0]=matriz[i][nA+j][0];
                                        respuesta[i][0][1]=matriz[i][nA+j][1];
                                    }
                                }
                                if (matriz[i][nA+nB - 1][1].compareTo(BigInteger.valueOf(1))==0) {
                                    todo = todo + matriz[i][nA+nB - 1][0] + "\\\\\n";
                                        respuesta[i][0][0]=matriz[i][nA+nB - 1][0];
                                        respuesta[i][0][1]=BigInteger.valueOf(1);
                                } else {
                                    todo = todo + matriz[i][nA+nB - 1][0] + "/" + matriz[i][nA+nB - 1][1] + "\\\\\n";
                                        respuesta[i][0][0]=matriz[i][nA+nB - 1][0];
                                        respuesta[i][0][1]=matriz[i][nA+nB - 1][1];
                                }
                            }
                            todo = todo + "\\end{bmatrix}\\]";
                            VectorGauss=respuesta;
                        }
                    } else {
                        todo = todo + ("hasta aqui llega, el sistema no tiene solucion");
                    }
                }else{
                    boolean verificadorEntero = true;
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[0].length; j++) {
                            if (matriz[i][j][1].compareTo(BigInteger.valueOf(1)) != 0) {
                                verificadorEntero = false;
                            }
                        }
                    }
                    if (verificadorEntero == false) {
                        decir("todas las entradas de ambas matrices deben de ser enteras");
                    } else {
                        if (Modulo.compareTo(BigInteger.valueOf(1))== -1) {
                            decir("el modulo tiene que ser un entero positivo");
                        } else {
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz[0].length; j++) {
                                    matriz[i][j][0] = Modulo.add(matriz[i][j][0]).mod(Modulo);
                                }
                            }
                            long[] indices = new long[modulo];
                            for (int i = 0; i < modulo; i++) {
                                indices[i] = -2;
                            }
                            inversos = new BigInteger[modulo];
                            todo = ("La matris resultante es,\n");
                            todo = todo + "\\[" + imprimirdet(matriz,nA) + "(mod " + modulo + ")\\]\n";
                            int mcd = 0;
                            boolean verificador2 = true;
                            for (int i = 0; i < mA - 1; i++) {
                                BigInteger clave = buscarInverso(matriz[i][i][0],indices,modulo);
                                if (clave.compareTo(BigInteger.valueOf(-1)) != 0) {
                                    verificador2 = false;
                                    for (int j = i; j < (nA + nB); j++) {
                                        matriz[i][j][0] = ((matriz[i][j][0].multiply(clave)).add(Modulo)).mod(Modulo);
                                    }
                                    BigInteger coso=(clave.add(Modulo)).mod(Modulo);
                                    if ((coso).compareTo(BigInteger.valueOf(1)) != 0) {
                                        todo = todo + ("$\\Rightarrow$ multiplicamos la fila " + (i + 1) + " dentro de " + clave + "\n");
                                        todo = todo + "\\[" + imprimirdet(matriz,nA) + "(mod " + modulo + ")\\]\n";
                                    }
                                    for (int j = i + 1; j < mA; j++) {
                                        clave = Modulo.subtract(matriz[j][i][0]);
                                        for (int k = i; k < (nA + nB); k++) {
                                            matriz[j][k][0] = ((matriz[j][k][0].add(clave.multiply(matriz[i][k][0]))).add(Modulo)).mod(Modulo);
                                        }
                                        if ((coso).compareTo(BigInteger.valueOf(1)) != 0) {
                                            todo = todo + ("$\\Rightarrow$ sumamos " + clave + " veces la fila " + (i + 1) + " a la fila " + (j + 1) + "\n");
                                            todo = todo + "\\[" + imprimirdet(matriz,nA) + "(mod " + modulo + ")\\]\n";
                                        }
                                    }
                                } else {
                                    for (int j = i; j < mA; j++) {
                                        if (buscarInverso(matriz[j][i][0],indices,modulo).compareTo(BigInteger.valueOf(-1)) != 0) {
                                            for (int k = 0; k < (nA + nB); k++) {
                                                BigInteger t = matriz[i][k][0];
                                                matriz[i][k][0] = matriz[j][k][0];
                                                matriz[j][k][0] = t;
                                            }
                                            todo = todo + ("$\\Rightarrow$ intercambiamos la fila " + (i + 1) + " con la fila " + (j + 1) + "\n");
                                            todo = todo + "\\[" + imprimirdet(matriz,nA) + "(mod " + modulo + ")\\]\n";
                                            j = mA;
                                            i--;
                                            verificador2 = false;
                                        }
                                    }
                                    if (verificador2 == true) {
                                        i = mA;
                                    }
                                }
                            }
                            BigInteger bla = buscarInverso(matriz[mA - 1][nA - 1][0],indices,modulo);
                            //decir(verificador2+"   "+bla);
                            if (verificador2 == false && bla.compareTo(BigInteger.valueOf(-1)) != 0) {
                                matriz[mA - 1][nA][0] = ((matriz[mA - 1][nA][0].multiply(bla)).add(Modulo)).mod(Modulo);
                                matriz[mA - 1][nA - 1][0] = BigInteger.valueOf(1);
                                if (((bla.add(Modulo)).mod(Modulo)).compareTo(BigInteger.valueOf(1)) != 0) {
                                    todo = todo + ("$\\Rightarrow$ multiplicamos la fila " + (nA) + " dentro de " + bla + "\n");
                                    todo = todo + "\\[" + imprimirdet(matriz,nA) + "(mod " + modulo + ")\\]\n";
                                }
                                for (int i = mA - 1; i > 0; i--) {
                                    for (int j = i - 1; j >= 0; j--) {
                                        BigInteger clave = Modulo.subtract(matriz[j][i][0]);
                                        for (int k = i; k < (nA + nB); k++) {
                                            matriz[j][k][0] = ((matriz[j][k][0].add((matriz[i][k][0].multiply(clave)))).add(Modulo)).mod(Modulo);
                                        }
                                        if (((clave.add(Modulo)).mod(Modulo)).compareTo(BigInteger.valueOf(0)) != 0) {
                                            todo = todo + ("$\\Rightarrow$ sumamos " + clave + " veces la fila " + (i + 1) + " a la fila " + (j + 1) + "\n");
                                            todo = todo + "\\[" + imprimirdet(matriz,nA) + "(mod " + modulo + ")\\]\n";
                                        }
                                    }
                                }
                            } else {
                                todo = todo + ("hasta aqui llega, el sistema no tiene solucion");
                            }
                        }
                    }
                }
            }
        }
        return todo;
    }                                       
    
    public static BigInteger[][][] RU=new BigInteger[0][0][2];
    public static BigInteger[][][] RL=new BigInteger[0][0][2];
    
    public static String FPAUL(BigInteger matriz1[][][]) {                                        
        // TODO add your handling code here:
        String todo="";
        boolean verificador = false;
        BigInteger L[][][]=new BigInteger[1][1][1];
        BigInteger I[][][]=new BigInteger[1][1][1];
        try {
            BigInteger a = matriz1[0][0][0];
            verificador = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debes de ingresar ambas matrizes primero");
        }
        if (verificador == true) {
            int mA = matriz1.length;
            int nA = matriz1[0].length;
            BigInteger matriz[][][] = new BigInteger[mA][nA][2];
            I=new BigInteger[mA][nA][2];
            L=new BigInteger[mA][nA][2];
            for (int i = 0; i < mA; i++) {
                for (int j = 0; j < (nA); j++) {
                    matriz[i][j][0] = matriz1[i][j][0];
                    matriz[i][j][1] = matriz1[i][j][1];
                    L[i][j][0] = BigInteger.valueOf(0);
                    L[i][j][1] = BigInteger.valueOf(1);
                    I[i][j][0] = BigInteger.valueOf(0);
                    I[i][j][1] = BigInteger.valueOf(1);
                    if(i==j){
                        L[i][j][0] = BigInteger.valueOf(1);
                        I[i][j][0] = BigInteger.valueOf(1);
                    }
                }
            }
            todo = ("\nLa matris A es,\n");
            todo = todo + imprimir(matriz,nA,true);
            BigInteger mcd =BigInteger.valueOf(0);
            boolean verificador2 = true;
            for (int i = 0; i < mA - 1; i++) {
                BigInteger[] clave = new BigInteger[2];
                clave[0] = matriz[i][i][0];
                clave[1] = matriz[i][i][1];
                if (clave[0] !=BigInteger.valueOf(0)) {
                    verificador2 = false;
                    for (int j = i + 1; j < mA; j++) {
//                        clave[0] = matriz[j][i][0];
//                        clave[1] = matriz[j][i][1];
                        clave[0] = matriz[j][i][0].multiply(matriz[i][i][1]);
                        clave[1] = matriz[j][i][1].multiply(matriz[i][i][0]);
                        mcd=MCD(clave[0],clave[1]);
                        clave[0]=clave[0].divide(mcd);
                        clave[1]=clave[1].divide(mcd);
                        for (int k = i; k < (nA); k++) {
                            matriz[j][k][0] = (matriz[j][k][0].multiply(clave[1].multiply(matriz[i][k][1]))).subtract(clave[0].multiply(matriz[i][k][0].multiply(matriz[j][k][1])));
                            matriz[j][k][1] = matriz[j][k][1].multiply(clave[1].multiply(matriz[i][k][1]));
                            mcd = MCD(matriz[j][k][0], matriz[j][k][1]);
                            matriz[j][k][0] = matriz[j][k][0].divide(mcd);
                            matriz[j][k][1] = matriz[j][k][1].divide(mcd);
                            if (matriz[j][k][1].compareTo(BigInteger.valueOf(0))==-1) {
                                matriz[j][k][0] = matriz[j][k][0].multiply(BigInteger.valueOf(-1));
                                matriz[j][k][1] = matriz[j][k][1].multiply(BigInteger.valueOf(-1));
                            }
                        }
                        L[j][i][0]=clave[0];
                        L[j][i][1]=clave[1];
                        if (clave[0]!=BigInteger.valueOf(0)){
                            if (clave[1] == BigInteger.valueOf(1)) {
                                todo = todo + ("$\\Rightarrow$ restamos " + clave[0] + " veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                            } else {
                                todo = todo + ("$\\Rightarrow$ restamos $\\frac{" + clave[0] + "}{" + clave[1] + "}$ veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                            }
                            todo = todo + imprimir(matriz,nA,true);
                        }
                    }
                } else {
                    for (int j = i; j < mA; j++) {
                        if (matriz[j][i][0] != BigInteger.valueOf(0)) {
                            for (int k = 0; k < (nA); k++) {
                                BigInteger t = matriz[i][k][0];
                                BigInteger u = matriz[i][k][1];
                                matriz[i][k][0] = matriz[j][k][0];
                                matriz[i][k][1] = matriz[j][k][1];
                                matriz[j][k][0] = t;
                                matriz[j][k][1] = u;
                                t = I[i][k][0];
                                u = I[i][k][1];
                                I[i][k][0] = I[j][k][0];
                                I[i][k][1] = I[j][k][1];
                                I[j][k][0] = t;
                                I[j][k][1] = u;
                            }
                            todo = todo + ("$\\Rightarrow$ intercambiamos la fila " + ((int) i + 1) + " con la fila " + (j + 1) + "\n");
                            todo = todo + imprimir(matriz,nA,true);
                            j = mA;
                            i--;
                            verificador2 = false;
                        }
                    }
                    if (verificador2 == true) {
                        i = mA;
                    }
                }
            }
            BigInteger bla0 = matriz[mA - 1][nA - 1][0];
            BigInteger bla1 = matriz[mA - 1][nA - 1][1];
//            decir(verificador2+"   "+bla0+"   "+(nA-1));
            if (verificador2 == false && bla0 != BigInteger.valueOf(0)) {
                if(mA==nA){
                    todo = todo +"\\[U="+ imprimirdet(matriz,nA)+"\\]\n"+"\\[L="+ imprimirdet(L,nA)+"\\]\n"+"\\[P="+ imprimirdet(I,nA)+"\\]\n";
                }
            } else {
                
                todo = todo + ("hasta aqui llega, el sistema no tiene solucion");
            }
            RU=matriz;
        }
        RL=L;
        return todo;
    }                
    
    public static BigInteger[][][] Hilbert (int n){
        BigInteger H [][][]=new BigInteger [n][n][2];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                H[i][j][0]=BigInteger.valueOf(1);
                H[i][j][1]=BigInteger.valueOf(i+j+1);
            }
        }
        return H;
    }
    
    public static BigInteger[][][] multiplicado=new BigInteger[0][0][2];
    
    public static String producto(BigInteger matriz1[][][],BigInteger matriz2[][][]) {                                             
        // TODO add your handling code here:
            String todo="";
        boolean verificador = false;
        try {
            BigInteger a = matriz1[0][0][0];
            a = matriz2[0][0][0];
            verificador = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debes de ingresar ambas matrizes primero");
        }
        if (verificador == true) {
            int mA = matriz1.length;
            int nA = matriz1[0].length;
            int mB = matriz2.length;
            int nB = matriz2[0].length;
            if (nA != mB) {
                decir("la cantidad de columnas de A debe ser la misma que la cantidad de filas de B");
            } else {
                BigInteger matrizA[][][] = new BigInteger[mA][nA][2];
                for (int i = 0; i < mA; i++) {
                    for (int j = 0; j < nA; j++) {
                        matrizA[i][j][0] = matriz1[i][j][0];
                        matrizA[i][j][1] = matriz1[i][j][1];
                    }
                }
                BigInteger matrizB[][][] = new BigInteger[mB][nB][2];
                for (int i = 0; i < mB; i++) {
                    for (int j = 0; j < nB; j++) {
                        matrizB[i][j][0] = matriz2[i][j][0];
                        matrizB[i][j][1] = matriz2[i][j][1];
                    }
                }
                BigInteger matriz[][][] = new BigInteger[mA][nB][2];
                todo = "\n\\[A\\cdot B=" + imprimirdet(matrizA,matrizA.length*2) + "\\cdot" + imprimirdet(matrizB,matrizB.length*2) + "=\\]\n\\[=\\left[\\begin{tabular}{"+tamano(nA)+"}$";
                for (int i = 0; i < mA; i++) {
                    for (int j = 0; j < nB; j++) {
                        BigInteger a=BigInteger.valueOf(0);
                        BigInteger b=BigInteger.valueOf(1);
                        for (int k = 0; k < nA; k++) {
                            String extra = "+";
                            if (k == nA - 1) {
                                extra = "$&$";
                                if (j == nB - 1) {
                                    if (i==mA-1){
                                        extra = "$\\\\\n";
                                    }else{
                                        extra = "$\\\\\n$";
                                    }
                                }
                            }
                            if (matrizA[i][k][1] ==BigInteger.valueOf(1)) {
                                todo = todo + matrizA[i][k][0] + "\\cdot";
                            } else {
                                todo = todo + "\\frac{" + matrizA[i][k][0] + "}{" + matrizA[i][k][1] + "}\\cdot";
                            }
                            if (matrizB[k][j][1] ==BigInteger.valueOf(1)) {
                                todo = todo + matrizB[k][j][0] + extra;
                            } else {
                                todo = todo + "\\frac{" + matrizB[k][j][0] + "}{" + matrizB[k][j][1] + "}" + extra;
                            }
                            BigInteger d= matrizB[k][j][1].multiply(matrizA[i][k][1]);
                            BigInteger c= (matrizB[k][j][0].multiply(matrizA[i][k][0]));
                            BigInteger mcd=MCD(c,d);
                            d=d.divide(mcd);
                            c=c.divide(mcd);
                            BigInteger e=b.multiply(d);
                            a=(a.multiply(d)).add(b.multiply(c));
                            b=e;
                            mcd=MCD(a,b);
                            a=a.divide(mcd);
                            b=b.divide(mcd);
                        }
                        matriz[i][j][0]=a;
                        matriz[i][j][1]=b;
                    }
                }
                todo = todo + "\\end{tabular}\\right]\\]\n\\[A*B=" + imprimirdet(matriz,matriz.length*2) + "\\]";
                multiplicado=matriz;
            }
        }
        return todo;
    }   
    
    public static  BigInteger[] ElDeterminante=new BigInteger[2];
    
    public static String Determinante (BigInteger matriz1[][][],String Latex){
        String todo="";
        boolean latex=true;
        if (Latex.equals("no")){
            latex=false;
        }
        BigInteger[] detA = new BigInteger[2];
        boolean verificador = false;
        try {
            BigInteger a = matriz1[0][0][1];
            verificador = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe de ingresar una matriz A primero");
        }
        if (verificador == true) {

            if (matriz1[0].length != matriz1.length) {
                JOptionPane.showMessageDialog(null, "solo se aceptan matrices cuadradas (m=n)");
            } else {
                BigInteger[][][] matriz = new BigInteger[matriz1.length][matriz1[0].length][2];
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1.length; j++) {
                        matriz[i][j][0] = matriz1[i][j][0];
                        matriz[i][j][1] = matriz1[i][j][1];
                    }
                }
                todo=todo+"\\[A="+imprimirdet(matriz,(2*matriz.length))+"\\]\n";
                switch (matriz1.length) {
                    case 1:
                        todo = todo + "\\[det(A)=";
                        if (matriz1[0][0][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[0][0][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[0][0][0] + "}{" + matriz1[0][0][1] + "}";
                        }
                        detA[1] = matriz1[0][0][1];
                        detA[0] = matriz1[0][0][0];
                        todo = todo + "\\]";
                        break;
                    case 2:
                        todo = todo + "\\[det(A)=";
                        if (matriz1[0][0][1].compareTo(BigInteger.ONE) != 0) {
                            todo = todo + "\\frac{" + matriz1[0][0][0] + "}{" + matriz1[0][0][1] + "}";
                        } else {
                            todo = todo + matriz1[0][0][0];
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[1][1][1].compareTo(BigInteger.ONE) != 0) {
                            todo = todo + "\\frac{" + matriz1[1][1][0] + "}{" + matriz1[1][1][1] + "}";
                        } else {
                            todo = todo + matriz1[1][1][0];
                        }
                        todo = todo + "-";
                        if (matriz1[1][0][1].compareTo(BigInteger.ONE) != 0) {
                            todo = todo + "\\frac{" + matriz1[1][0][0] + "}{" + matriz1[1][0][1] + "}";
                        } else {
                            todo = todo + matriz1[1][0][0];
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[0][1][1].compareTo(BigInteger.ONE) != 0) {
                            todo = todo + "\\frac{" + matriz1[0][1][0] + "}{" + matriz1[0][1][1] + "}";
                        } else {
                            todo = todo + matriz1[0][1][0];
                        }
                        todo = todo + "=";
                        BigInteger numeroador = (matriz1[0][0][0].multiply(matriz1[1][1][0]).multiply(matriz1[1][0][1]).multiply(matriz1[0][1][1])).subtract(matriz1[0][0][1].multiply(matriz1[1][1][1]).multiply(matriz1[1][0][0]).multiply(matriz1[0][1][0]));
                        BigInteger denominador = matriz1[0][0][1].multiply(matriz1[1][1][1]).multiply(matriz1[1][0][1]).multiply(matriz1[0][1][1]);
                        BigInteger mcd = MCD(numeroador, denominador);
                        detA[0] = numeroador.divide(mcd);
                        detA[1] = denominador.divide(mcd);
                        if (detA[1].compareTo(BigInteger.ONE) != 0) {
                            todo = todo + "\\frac{" + detA[0] + "}{" + detA[1] + "}";
                        } else {
                            todo = todo + detA[0];
                        }
                        todo = todo + "\\]";
                        break;
                    case 3:
                        todo = todo + "\\[det(A)=";
                        if (matriz1[0][0][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[0][0][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[0][0][0] + "}{" + matriz1[0][0][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[1][1][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[1][1][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[1][1][0] + "}{" + matriz1[1][1][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[2][2][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[2][2][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[2][2][0] + "}{" + matriz1[2][2][1] + "}";
                        }
                        todo = todo + "+";
                        if (matriz1[0][1][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[0][1][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[0][1][0] + "}{" + matriz1[0][1][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[1][2][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[1][2][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[1][2][0] + "}{" + matriz1[1][2][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[2][0][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[2][0][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[2][0][0] + "}{" + matriz1[2][0][1] + "}";
                        }
                        todo = todo + "+";
                        if (matriz1[0][2][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[0][2][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[0][2][0] + "}{" + matriz1[0][2][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[1][0][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[1][0][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[1][0][0] + "}{" + matriz1[1][0][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[2][1][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[2][1][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[2][1][0] + "}{" + matriz1[2][1][1] + "}";
                        }
                        todo = todo + "-";
                        if (matriz1[2][0][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[2][0][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[2][0][0] + "}{" + matriz1[2][0][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[1][1][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[1][1][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[1][1][0] + "}{" + matriz1[1][1][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[0][2][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[0][2][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[0][2][0] + "}{" + matriz1[0][2][1] + "}";
                        }
                        todo = todo + "-";
                        if (matriz1[2][1][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[2][1][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[2][1][0] + "}{" + matriz1[2][1][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[1][2][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[1][2][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[1][2][0] + "}{" + matriz1[1][2][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[0][0][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[0][0][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[0][0][0] + "}{" + matriz1[0][0][1] + "}";
                        }
                        todo = todo + "-";
                        if (matriz1[2][2][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[2][2][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[2][2][0] + "}{" + matriz1[2][2][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[1][0][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[1][0][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[1][0][0] + "}{" + matriz1[1][0][1] + "}";
                        }
                        todo = todo + "\\cdot";
                        if (matriz1[0][1][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz1[0][1][0];
                        } else {
                            todo = todo + "\\frac{" + matriz1[0][1][0] + "}{" + matriz1[0][1][1] + "}";
                        }
                        todo = todo + "=";
                        BigInteger denominador1 = matriz1[0][0][1].multiply(matriz1[1][1][1]).multiply(matriz1[2][2][1]).multiply(matriz1[0][1][1]).multiply(matriz1[1][2][1] ).multiply( matriz1[2][0][1] ).multiply( matriz1[0][2][1] ).multiply( matriz1[1][0][1] ).multiply( matriz1[2][1][1]);
                        BigInteger numerador = (matriz1[0][0][0].multiply( matriz1[1][1][0] ).multiply( matriz1[2][2][0] ).multiply( matriz1[0][1][1] ).multiply( matriz1[1][2][1] ).multiply( matriz1[2][0][1] ).multiply( matriz1[0][2][1] ).multiply( matriz1[1][0][1] ).multiply( matriz1[2][1][1])).add(
                                 matriz1[0][0][1] .multiply( matriz1[1][1][1] ).multiply( matriz1[2][2][1] ).multiply( matriz1[0][1][0] ).multiply( matriz1[1][2][0] ).multiply( matriz1[2][0][0] ).multiply( matriz1[0][2][1] ).multiply(matriz1[1][0][1] ).multiply( matriz1[2][1][1])).add(
                                 matriz1[0][0][1] .multiply( matriz1[1][1][1] ).multiply( matriz1[2][2][1] ).multiply( matriz1[0][1][1] ).multiply( matriz1[1][2][1] ).multiply( matriz1[2][0][1] ).multiply( matriz1[0][2][0] ).multiply( matriz1[1][0][0] ).multiply( matriz1[2][1][0])).subtract(
                                 matriz1[0][0][1] .multiply( matriz1[1][1][0] ).multiply( matriz1[2][2][1] ).multiply( matriz1[0][1][1] ).multiply( matriz1[1][2][1] ).multiply( matriz1[2][0][0] ).multiply( matriz1[0][2][0] ).multiply( matriz1[1][0][1] ).multiply(matriz1[2][1][1])).subtract(
                                 matriz1[0][0][0] .multiply( matriz1[1][1][1] ).multiply( matriz1[2][2][1] ).multiply( matriz1[0][1][1] ).multiply( matriz1[1][2][0] ).multiply( matriz1[2][0][1] ).multiply( matriz1[0][2][1] ).multiply( matriz1[1][0][1] ).multiply( matriz1[2][1][0])).subtract(
                                 matriz1[0][0][1] .multiply( matriz1[1][1][1] ).multiply( matriz1[2][2][0] ).multiply( matriz1[0][1][0] ).multiply( matriz1[1][2][1] ).multiply( matriz1[2][0][1] ).multiply( matriz1[0][2][1] ).multiply( matriz1[1][0][0] ).multiply( matriz1[2][1][1]));
                        BigInteger mcd1 = MCD(numerador, denominador1);
                        detA[0] = numerador.divide(mcd1);
                        detA[1] = denominador1.divide(mcd1);
                        if (detA[1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + detA[0];
                        } else {
                            todo = todo + "\\frac{" + detA[0] + "}{" + detA[1] + "}\\]";
                        }
                        break;
                    default:
                        int contador = 0;
                        todo = "la matriz resultante es,\n";
                        if (latex == true) {
                            todo = todo + "\\[A=";
                        }
                        todo = todo + imprimirdet(matriz,(2*matriz.length));
                        contador++;
                        BigInteger[] numeroMagico = new BigInteger[2];
                        numeroMagico[0] =BigInteger.ONE;
                        numeroMagico[1] =BigInteger.ONE;
                        if (latex == true) {
                            todo = todo + "\\]\n";
                        }
                        boolean verificador2 = true;
                        for (int i = 0; i < matriz.length - 1; i++) {
                            BigInteger[] clave = new BigInteger[2];
                            clave[0] = matriz[i][i][0];
                            clave[1] = matriz[i][i][1];
                            if (clave[0].compareTo(BigInteger.ZERO) != 0) {
                                verificador2 = false;
                                for (int j = i; j < matriz.length; j++) {
                                    matriz[i][j][0] = matriz[i][j][0].multiply(clave[1]);
                                    matriz[i][j][1] = matriz[i][j][1].multiply(clave[0]);
                                    BigInteger mcd2 = MCD(matriz[i][j][0], matriz[i][j][1]);
                                    matriz[i][j][0] = matriz[i][j][0].divide(mcd2);
                                    matriz[i][j][1] = matriz[i][j][1].divide(mcd2);
                                    if (matriz[i][j][1].compareTo(BigInteger.ZERO) <0) {
                                        matriz[i][j][0] = matriz[i][j][0].multiply(BigInteger.valueOf(-1));
                                        matriz[i][j][1] = matriz[i][j][1].multiply(BigInteger.valueOf(-1));
                                    }
                                }
                                if (clave[0].compareTo(BigInteger.ONE) != 0 || clave[1].compareTo(BigInteger.ONE) != 0) {
                                    if (clave[1].compareTo(BigInteger.ONE) != 0) {
                                        todo = todo + "$\\Rightarrow$ dividimos la fila " + (i + 1) + " dentro de $\\frac{" + clave[0] + "}{" + clave[1] + "}$\n";
                                    } else {
                                        todo = todo + "$\\Rightarrow$ dividimos la fila " + (i + 1) + " dentro de " + clave[0] + "\n";
                                    }
                                    if (latex == true) {
                                        todo = todo + "\\[A_" + contador + "=";
                                    }
                                    todo = todo + imprimirdet(matriz,(2*matriz.length));
                                    numeroMagico[0] = numeroMagico[0].multiply(clave[1]);
                                    numeroMagico[1] = numeroMagico[1].multiply(clave[0]);
                                    BigInteger mcd2 = MCD(numeroMagico[0], numeroMagico[1]);
                                    numeroMagico[0] = numeroMagico[0].divide(mcd2);
                                    numeroMagico[1] = numeroMagico[1].divide(mcd2);
                                    if (numeroMagico[1].compareTo(BigInteger.ZERO) < 0) {
                                        numeroMagico[0] = numeroMagico[0].multiply(BigInteger.valueOf(-1));
                                        numeroMagico[1] = numeroMagico[1].multiply(BigInteger.valueOf(-1));
                                    }
                                    if (numeroMagico[1].compareTo(BigInteger.ONE) == 0) {
                                        if (numeroMagico[0].compareTo(BigInteger.ONE) == 0) {
                                            todo = todo + "\\Rightarrow det(A_" + contador + ")=det(A)\\]\n";
                                        } else {
                                            todo = todo + "\\Rightarrow det(A_" + contador + ")=" + numeroMagico[0] + "det(A)\\]\n";
                                        }
                                    } else {
                                        todo = todo + "\\Rightarrow det(A_" + contador + ")=\\frac{" + numeroMagico[0] + "}{" + numeroMagico[1] + "}det(A)\\]\n";
                                    }
                                    contador++;
                                }
                                for (int j = i + 1; j < matriz.length; j++) {
                                    clave[0] = matriz[j][i][0];
                                    clave[1] = matriz[j][i][1];
                                    for (int k = i; k < matriz.length; k++) {
                                        matriz[j][k][0] = (matriz[j][k][0].multiply(clave[1]).multiply(matriz[i][k][1])).subtract(clave[0].multiply(matriz[i][k][0]).multiply(matriz[j][k][1]));
                                        matriz[j][k][1] = matriz[j][k][1].multiply(matriz[i][k][1]).multiply(clave[1]);
                                        BigInteger mcd2 = MCD(matriz[j][k][0], matriz[j][k][1]);
                                        matriz[j][k][0] = matriz[j][k][0].divide(mcd2);
                                        matriz[j][k][1] = matriz[j][k][1].divide(mcd2);
                                        if (matriz[j][k][1].compareTo(BigInteger.ZERO) < 0) {
                                            matriz[j][k][0] = matriz[j][k][0].multiply(BigInteger.valueOf(-1));
                                            matriz[j][k][1] = matriz[j][k][1].multiply(BigInteger.valueOf(-1));
                                        }
                                    }
                                    if (clave[0].compareTo(BigInteger.ZERO) != 0) {
                                        if (clave[1].compareTo(BigInteger.ONE) == 0) {
                                            todo = todo + ("$\\Rightarrow$ restamos " + clave[0] + " veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                                        } else {
                                            todo = todo + ("$\\Rightarrow$ restamos $\\frac{" + clave[0] + "}{" + clave[1] + "}$ veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                                        }
                                        if (latex == true) {
                                            todo = todo + "\\[A_" + contador + "=";
                                        }
                                        todo = todo + imprimirdet(matriz,(2*matriz.length));
                                        if (numeroMagico[1].compareTo(BigInteger.ONE) == 0) {
                                            if (numeroMagico[0].compareTo(BigInteger.ONE) == 0) {
                                                todo = todo + "\\Rightarrow det(A_" + contador + ")=det(A)\\]\n";
                                            } else {
                                                todo = todo + "\\Rightarrow det(A_" + contador + ")=" + numeroMagico[0] + "det(A)\\]\n";
                                            }
                                        } else {
                                            todo = todo + "\\Rightarrow det(A_" + contador + ")=\\frac{" + numeroMagico[0] + "}{" + numeroMagico[1] + "}det(A)\\]\n";
                                        }
                                        contador++;
                                    }
                                }
                            } else {
                                for (int j = i; j < matriz.length; j++) {
                                    if (matriz[j][i][0].compareTo(BigInteger.ZERO) != 0) {
                                        for (int k = 0; k < matriz.length; k++) {
                                            BigInteger t = matriz[i][k][0];
                                            BigInteger u = matriz[i][k][1];
                                            matriz[i][k][0] = matriz[j][k][0];
                                            matriz[i][k][1] = matriz[j][k][1];
                                            matriz[j][k][0] = t;
                                            matriz[j][k][1] = u;
                                        }
                                        todo = todo + ("$\\Rightarrow$ intercambiamos la fila " + ((int) i + 1) + " con la fila " + (j + 1) + "\n");
                                        if (latex == true) {
                                            todo = todo + "\\[A_" + contador + "=";
                                        }
                                        todo = todo + imprimirdet(matriz,(2*matriz.length));
                                        numeroMagico[0] = numeroMagico[0].multiply(BigInteger.valueOf(-1));
                                        if (numeroMagico[1].compareTo(BigInteger.ONE) == 0) {
                                            if (numeroMagico[0].compareTo(BigInteger.ONE) == 0) {
                                                todo = todo + "\\Rightarrow det(A_" + contador + ")=det(A)\\]\n";
                                            } else {
                                                todo = todo + "\\Rightarrow det(A_" + contador + ")=" + numeroMagico[0] + "det(A)\\]\n";
                                            }
                                        } else {
                                            todo = todo + "\\Rightarrow det(A_" + contador + ")=\\frac{" + numeroMagico[0] + "}{" + numeroMagico[1] + "}det(A)\\]\n";
                                        }
                                        contador++;
                                        j = matriz.length;
                                        i--;
                                        verificador2 = false;
                                    }
                                }
                                if (verificador2 == true) {
                                    i = matriz.length;
                                }
                            }
                        }
                        BigInteger bla0 = matriz[matriz.length - 1][matriz.length - 1][0];
                        BigInteger bla1 = matriz[matriz.length - 1][matriz.length - 1][1];
                        //decir(verificador2+"   "+bla);
                        boolean tiene=true;
                        if (verificador2 == false && bla0.compareTo(BigInteger.ZERO) != 0) {
                            matriz[matriz.length - 1][matriz.length - 1][0] = BigInteger.ONE;
                            matriz[matriz.length - 1][matriz.length - 1][1] = BigInteger.ONE;
                            if (((bla0).compareTo(BigInteger.ONE) != 0 || bla1.compareTo(BigInteger.ONE) != 0)) {
                                if (bla1.compareTo(BigInteger.ONE) == 0) {
                                    todo = todo + ("$\\Rightarrow$ dividimos la fila " + (matriz.length) + " dentro de " + (bla0) + "\n");
                                } else {
                                    todo = todo + ("$\\Rightarrow$ dividimos la fila " + (matriz.length) + " dentro de $\\frac{" + (bla0) + "}{" + bla1 + "}$\n");
                                }
                                if (latex == true) {
                                    todo = todo + "\\[A_" + contador + "=";
                                }
                                todo = todo + imprimirdet(matriz,(2*matriz.length));
                                numeroMagico[0] = (numeroMagico[0].multiply(bla1));
                                numeroMagico[1] = (numeroMagico[1].multiply(bla0));
                                BigInteger mcd2 = MCD(numeroMagico[0], numeroMagico[1]);
                                numeroMagico[0] = numeroMagico[0].divide(mcd2);
                                numeroMagico[1] = numeroMagico[1].divide(mcd2);
                                if (numeroMagico[1].compareTo(BigInteger.ZERO) < 0) {
                                    numeroMagico[0] = numeroMagico[0].multiply(BigInteger.valueOf(-1));
                                    numeroMagico[1] = numeroMagico[1].multiply(BigInteger.valueOf(-1));
                                }
                                if (numeroMagico[1].compareTo(BigInteger.ONE) == 0) {
                                    if (numeroMagico[0].compareTo(BigInteger.ONE) == 0) {
                                        todo = todo + "\\Rightarrow det(A_" + contador + ")=det(A)\\]\n";
                                    } else {
                                        todo = todo + "\\Rightarrow det(A_" + contador + ")=" + numeroMagico[0] + "det(A)\\]\n";
                                    }
                                } else {
                                    todo = todo + "\\Rightarrow det(A_" + contador + ")=\\frac{" + numeroMagico[0] + "}{" + numeroMagico[1] + "}det(A)\\]\n";
                                }
                                contador++;
                            }
                        } else {
                            todo = todo + ("hasta aqui llega, el sistema no tiene solucion\n$\\therefore$ det(A)=0");
                            detA[0]=BigInteger.ZERO;
                            detA[1]=BigInteger.ONE;
                            tiene=false;
                        }
                        if(tiene==true){
                            if (numeroMagico[1].compareTo(BigInteger.ONE) == 0) {
                                if (numeroMagico[0].compareTo(BigInteger.ONE) == 0) {
                                    todo = todo + "\\[det(A_" + (contador - 1) + ")=det\\left(" + imprimirdet(matriz,(2*matriz.length)) + "\\right)=1=det(A)\\]\n";
                                    todo = todo + "\\[\\therefore det(A)=1\\]";
                                    detA[0] = BigInteger.ONE;
                                    detA[1] = BigInteger.ONE;
                                } else {
                                    todo = todo + "\\[det(A_" + (contador - 1) + ")=det\\left(" + imprimirdet(matriz,(2*matriz.length)) + "\\right)=1=" + numeroMagico[0] + "det(A)\\]\n";
                                    todo = todo + "\\[\\therefore det(A)=\\frac{1}{" + numeroMagico[0] + "}\\]";
                                    detA[0] = BigInteger.ONE;
                                    detA[1] = numeroMagico[0];
                                }
                            } else {
                                todo = todo + "\\[det(A_" + (contador - 1) + ")=det\\left(" + imprimirdet(matriz,(2*matriz.length)) + "\\right)=1=\\frac{" + numeroMagico[0] + "}{" + numeroMagico[1] + "}det(A)\\]\n";
                                if (numeroMagico[0].compareTo(BigInteger.ONE) != 0) {
                                    if (numeroMagico[0].compareTo(BigInteger.ZERO) < 0) {
                                        todo = todo + "\\[\\therefore det(A)=\\frac{" + (numeroMagico[1].compareTo(BigInteger.valueOf((-1)))) + "}{" + (numeroMagico[0].compareTo(BigInteger.valueOf(-1))) + "}\\]";
                                    } else {
                                        todo = todo + "\\[\\therefore det(A)=\\frac{" + numeroMagico[1] + "}{" + numeroMagico[0] + "}\\]";
                                    }
                                } else {
                                    todo = todo + "\\[\\therefore det(A)=" + numeroMagico[1] + "\\]";
                                }
                                detA[0] = numeroMagico[1];
                                detA[1] = numeroMagico[0];
                            }
                        }
                        break;
                }
            }
        }
        ElDeterminante[0]=detA[0];
        ElDeterminante[1]=detA[1];
        return todo;
    }
    
    public static String Inverso(BigInteger matriz1[][][]){
        boolean mostrar = false;
        Determinante(matriz1,"no");
        BigInteger detA[]=new BigInteger [2];
        detA[0]=ElDeterminante[0];
        detA[1]=ElDeterminante[1];
        mostrar = true;
        String todo = "";
        BigInteger mcd = BigInteger.valueOf(0);
        int n = matriz1.length;
        if (detA[0].compareTo(BigInteger.ZERO) == 0) {
            JOptionPane.showMessageDialog(null, "el determinante de la funcion no puede ser igual a 0");
        } else {
            BigInteger matriz[][][] = new BigInteger[n][2 * n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    matriz[i][j][1] = BigInteger.ONE;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j][0] = matriz1[i][j][0];
                    matriz[i][j][1] = matriz1[i][j][1];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        matriz[i][j + n][0] = BigInteger.ONE;
                    } else {
                        matriz[i][j + n][0] = BigInteger.ZERO;
                    }
                }
            }
            todo=todo+"\\[A="+imprimirdet(matriz1,(2*matriz1.length))+"\\]\nSi $[A|I]\\to[I|A^{-1}]$\n";
            todo = todo + ("$\\Rightarrow$\n");
            todo = todo + imprimir(matriz,n,true);
            boolean verificador2 = true;
            for (int i = 0; i < n - 1; i++) {
                BigInteger[] clave = new BigInteger[2];
                clave[0] = matriz[i][i][0];
                clave[1] = matriz[i][i][1];
                if (clave[0].compareTo(BigInteger.ZERO) != 0) {
                    verificador2 = false;
                    for (int j = i; j < n * 2; j++) {
                        matriz[i][j][0] = matriz[i][j][0].multiply(clave[1]);
                        matriz[i][j][1] = matriz[i][j][1].multiply(clave[0]);
                        mcd = MCD(matriz[i][j][0], matriz[i][j][1]);
                        matriz[i][j][0] = matriz[i][j][0].divide(mcd);
                        matriz[i][j][1] = matriz[i][j][1].divide(mcd);
                        if (matriz[i][j][1].compareTo(BigInteger.ONE) < 0) {
                            matriz[i][j][0] = matriz[i][j][0].multiply(BigInteger.valueOf(-1));
                            matriz[i][j][1] = matriz[i][j][1].multiply(BigInteger.valueOf(-1));
                        }
                    }
                    if (clave[0].compareTo(BigInteger.ONE) != 0 || clave[1].compareTo(BigInteger.ONE) != 0) {
                        if (clave[1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + ("$\\Rightarrow$ dividimos la fila " + (i + 1) + " dentro de " + clave[0] + "\n");
                        } else {
                            todo = todo + ("$\\Rightarrow$ dividimos la fila " + (i + 1) + " dentro de $\\frac{" + clave[0] + "}{" + clave[1] + "}$\n");
                        }
                        todo = todo + imprimir(matriz,n,true);
                    }
                    for (int j = i + 1; j < n; j++) {
                        clave[0] = matriz[j][i][0];
                        clave[1] = matriz[j][i][1];
                        for (int k = i; k < n * 2; k++) {
                            matriz[j][k][0] = (matriz[j][k][0].multiply(clave[1]).multiply(matriz[i][k][1])).subtract(clave[0].multiply(matriz[i][k][0]).multiply(matriz[j][k][1]));
                            matriz[j][k][1] = matriz[j][k][1].multiply(clave[1]).multiply(matriz[i][k][1]);
                            mcd = MCD(matriz[j][k][0], matriz[j][k][1]);
                            matriz[j][k][0] = matriz[j][k][0].divide(mcd);
                            matriz[j][k][1] = matriz[j][k][1].divide(mcd);
                            if (matriz[j][k][1].compareTo(BigInteger.ZERO) < 0) {
                                matriz[j][k][0] = matriz[j][k][0].multiply(BigInteger.valueOf(-1));
                                matriz[j][k][1] = matriz[j][k][1].multiply(BigInteger.valueOf((-1)));
                            }
                        }
                        if (clave[1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + ("$\\Rightarrow$ restamos " + clave[0] + " veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                        } else {
                            todo = todo + ("$\\Rightarrow$ restamos $\\frac{" + clave[0] + "}{" + clave[1] + "}$ veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                        }
                        todo = todo + imprimir(matriz,n,true);
                    }
                } else {
                    for (int j = i; j < n; j++) {
                        if (matriz[j][i][0].compareTo(BigInteger.ZERO) != 0) {
                            for (int k = 0; k < n * 2; k++) {
                                BigInteger t = matriz[i][k][0];
                                BigInteger u = matriz[i][k][1];
                                matriz[i][k][0] = matriz[j][k][0];
                                matriz[i][k][1] = matriz[j][k][1];
                                matriz[j][k][0] = t;
                                matriz[j][k][1] = u;
                            }
                            todo = todo + ("$\\Rightarrow$ intercambiamos la fila " + ((int) i + 1) + " con la fila " + (j + 1) + "\n");
                            todo = todo + imprimir(matriz,n,true);
                            j = n;
                            i--;
                            verificador2 = false;
                        }
                    }
                    if (verificador2 == true) {
                        i = n;
                    }
                }
            }
            BigInteger bla0 = matriz[n - 1][n - 1][0];
            BigInteger bla1 = matriz[n - 1][n - 1][1];
            //decir(verificador2+"   "+bla);
            if (verificador2 == false && bla0.compareTo(BigInteger.ZERO) != 0) {
                for (int i = 0; i < n; i++) {
                    matriz[n - 1][n + i][0] = matriz[n - 1][n + i][0].multiply(bla1);
                    matriz[n - 1][n + i][1] = matriz[n - 1][n + i][1].multiply(bla0);
                    mcd = MCD(matriz[n - 1][n + i][1], matriz[n - 1][n + i][0]);
                    matriz[n - 1][n + i][0] = matriz[n - 1][n + i][0].divide(mcd);
                    matriz[n - 1][n + i][1] = matriz[n - 1][n + i][1].divide(mcd);
                    if (matriz[n - 1][n + i][1].compareTo(BigInteger.ZERO) < 0) {
                        matriz[n - 1][n + i][0] = matriz[n - 1][n + i][0].multiply(BigInteger.valueOf(-1));
                        matriz[n - 1][n + i][1] = matriz[n - 1][n + i][1].multiply(BigInteger.valueOf(-1));
                    }
                }
                matriz[n - 1][n - 1][0] = BigInteger.ONE;
                matriz[n - 1][n - 1][1] = BigInteger.ONE;
                if (bla1.compareTo(bla1) == 1) {
                    todo = todo + ("$\\Rightarrow$ dividimos la fila " + (n) + " dentro de " + bla0 + "\n");
                } else {
                    todo = todo + ("$\\Rightarrow$ dividimos la fila " + (n) + " dentro de $\\frac{" + bla0 + "}{" + bla1 + "}$\n");
                }
                todo = todo + imprimir(matriz,n,true);
                for (int i = n - 1; i > 0; i--) {
                    for (int j = i - 1; j >= 0; j--) {
                        BigInteger clave[] = new BigInteger[2];
                        clave[0] = matriz[j][i][0];
                        clave[1] = matriz[j][i][1];
                        for (int k = i; k < n * 2; k++) {
                            matriz[j][k][0] = (matriz[j][k][0].multiply(matriz[i][k][1].multiply(clave[1]))).subtract(matriz[i][k][0].multiply(clave[0]).multiply(matriz[j][k][1]));
                            matriz[j][k][1] = matriz[j][k][1].multiply(matriz[i][k][1]).multiply(clave[1]);
                            mcd = MCD(matriz[j][k][0], matriz[j][k][1]);
                            matriz[j][k][0] = matriz[j][k][0].divide(mcd);
                            matriz[j][k][1] = matriz[j][k][1].divide(mcd);
                            if (matriz[j][k][1].compareTo(BigInteger.ONE) < 0) {
                                matriz[j][k][0] = matriz[j][k][0].multiply(BigInteger.valueOf(-1));
                                matriz[j][k][1] = matriz[j][k][1].multiply(BigInteger.valueOf(-1));
                            }
                        }
                        if (clave[1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + ("$\\Rightarrow$ restamos " + clave[0] + " veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                        } else {
                            todo = todo + ("$\\Rightarrow$ restamos $\\frac{" + clave[0] + "}{" + clave[1] + "}$ veces la fila " + ((int) i + 1) + " a la fila " + (j + 1) + "\n");
                        }
                        todo = todo + imprimir(matriz,n,true);
                    }
                }
                todo = todo + "$\\therefore A^{-1}=\\begin{bmatrix}\n";
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length - 1; j++) {
                        if (matriz[i][j + matriz.length][1].compareTo(BigInteger.ONE) == 0) {
                            todo = todo + matriz[i][j + matriz.length][0] + "&";
                        } else {
                            todo = todo + matriz[i][j + matriz.length][0] + "/" + matriz[i][j + matriz.length][1] + "&";
                        }
                    }
                    if (matriz[i][2 * matriz.length - 1][1].compareTo(BigInteger.ONE) == 0) {
                        todo = todo + matriz[i][2 * matriz.length - 1][0] + "\\\\\n";
                    } else {
                        todo = todo + matriz[i][2 * matriz.length - 1][0] + "/" + matriz[i][2 * matriz.length - 1][1] + "\\\\\n";
                    }
                }
                todo = todo + "\\end{bmatrix}$";
            } else {
                todo = todo + ("hasta aqui llega, el sistema no tiene solucion");
            }
        }
        return todo;
    }
    
    public static String queVector(int n, BigInteger matriz[][][], int a) {
        String r = "";
        if (matriz[a][0][1].compareTo(BigInteger.ONE) == 0) {
            r = "\\begin{bmatrix}" + matriz[a][0][0];
        } else {
            r = "\\begin{bmatrix}" + matriz[a][0][0] + "/" + matriz[a][0][1];
        }
        for (int i = 1; i < n; i++) {
            if (matriz[a][i][1].compareTo(BigInteger.ONE) == 0) {
                r = r + "\\\\" + matriz[a][i][0];
            } else {
                r = r + "\\\\" + matriz[a][i][0] + "/" + matriz[a][i][1];
            }
        }
        r = r + "\\end{bmatrix}";
        return r;
    }

    public static String Ortogonalizar(BigInteger matriz1[][][]){
        boolean verificador = false;
        String todo = "";
        int n = 0;
        int m = 0;
        BigInteger matriz[][][] = new BigInteger[0][0][2];
        try {
            n = matriz1.length;
            m = matriz1[0].length;
            BigInteger a = matriz1[0][0][0];
            verificador = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe de ingresar una matriz A primero");
        }
        if (verificador == true) {
            if (n != n) {
                JOptionPane.showMessageDialog(null, "debe de ser una matriz cuadrada (m=n)");
            } else {
                matriz = new BigInteger[m][n][2];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        matriz[i][j][0] = matriz1[j][i][0];
                        matriz[i][j][1] = matriz1[j][i][1];
                    }
                }
                String B = "";
                if (matriz[0][0][1].compareTo(BigInteger.ONE) == 0) {
                    B = "$A=\\left\\{\\begin{bmatrix}" + matriz[0][0][0];
                } else {
                    B = "$A=\\left\\{\\begin{bmatrix}" + matriz[0][0][0] + "/" + matriz[0][0][1];
                }
                for (int i = 1; i < n; i++) {
                    if (matriz[0][i][1].compareTo(BigInteger.ONE) == 0) {
                        B = B + "\\\\" + matriz[0][i][0];
                    } else {
                        B = B + "\\\\" + matriz[0][i][0] + "/" + matriz[0][i][1];
                    }
                }
                B = B + "\\end{bmatrix}";
                for (int i = 1; i < m; i++) {
                    B = B + "," + queVector(m, matriz, i);
                }
                todo = todo + (B + "\\right\\}$\n");
                todo = todo + ("\n");
                todo = todo + ("\\[W_n=V_n-\\sum_{i=1}^{n-1}\\frac{V_n\\cdot W_i}{W_i\\cdot W_i}W_i\\]\n");
                for (int i = 0; i < m; i++) {
                    todo = todo + ("\\[\\begin{array}{rl}\n");
                    todo = todo + ("W_" + (i + 1) + "= & V_" + (i + 1) + "-\\sum_{i=1}^{" + (i) + "}\\frac{V_" + (i + 1) + "\\cdot W_i}{W_i\\cdot W_i}W_i \\\\\n");
                    todo = todo + ("\\\\\n");
                    String exp = "= & V_" + (i + 1);
                    for (int j = 0; j < i; j++) {
                        exp = exp + "-\\frac{V_" + (i + 1) + "\\cdot W_" + (j + 1) + "}{W_" + (j + 1) + "\\cdot W_" + (j + 1) + "}W_" + (j + 1);
                    }
                    todo = todo + (exp + " \\\\\n");
                    todo = todo + ("\\\\\n");
                    exp = "= & " + queVector(n, matriz, i);
                    for (int j = 0; j < i; j++) {
                        exp = exp + "-\\frac{" + queVector(n, matriz, i) + "\\cdot " + queVector(n, matriz, j) + "}{" + queVector(n, matriz, j) + "\\cdot " + queVector(n, matriz, j) + "}" + queVector(n, matriz, j);
                    }
                    todo = todo + (exp + " \\\\\n");
                    todo = todo + ("\\\\\n");
                    exp = "= & " + queVector(n, matriz, i);
                    BigInteger vector[][] = new BigInteger[n][2];
                    for (int j = 0; j < n; j++) {
                        vector[j][0] = matriz[i][j][0];
                        vector[j][1] = matriz[i][j][1];
                    }
                    for (int j = 0; j < i; j++) {
                        BigInteger proyeccion1[] = new BigInteger[2];
                        BigInteger proyeccion2[] = new BigInteger[2];
                        proyeccion1[0] = BigInteger.ZERO;
                        proyeccion1[1] = BigInteger.ONE;
                        proyeccion2[0] = BigInteger.ZERO;
                        proyeccion2[1] = BigInteger.ONE;
                        for (int h = 0; h < n; h++) {
                            proyeccion1[0] = (proyeccion1[0].multiply(vector[h][1]).multiply(matriz[j][h][1])).add((vector[h][0].multiply(matriz[j][h][0]).multiply(proyeccion1[1])));
                            proyeccion1[1] = proyeccion1[1].multiply(vector[h][1]).multiply(matriz[j][h][1]);
                            BigInteger mcd = MCD(proyeccion1[0], proyeccion1[1]);
                            if (mcd.compareTo(BigInteger.ZERO) != 0) {
                                proyeccion1[0] = proyeccion1[0].divide(mcd);
                                proyeccion1[1] = proyeccion1[1].divide(mcd);
                            }
                            if (proyeccion1[1].compareTo(BigInteger.ZERO) < 0) {
                                proyeccion1[0] = proyeccion1[0].multiply(BigInteger.valueOf(-1));
                                proyeccion1[1] = proyeccion1[1].multiply(BigInteger.valueOf(-1));
                            }
                            proyeccion2[0] = (proyeccion2[0].multiply(matriz[j][h][1]).multiply(matriz[j][h][1])).add(matriz[j][h][0].multiply(matriz[j][h][0]).multiply(proyeccion2[1]));
                            proyeccion2[1] = proyeccion2[1].multiply(matriz[j][h][1]).multiply(matriz[j][h][1]);
                            mcd = MCD(proyeccion2[0], proyeccion2[1]);
                            if (mcd.compareTo(BigInteger.ZERO) != 0) {
                                proyeccion2[0] = proyeccion2[0].divide(mcd);
                                proyeccion2[1] = proyeccion2[1].divide(mcd);
                            }
                            if (proyeccion2[1].compareTo(BigInteger.ZERO) < 0) {
                                proyeccion2[0] = proyeccion2[0].multiply(BigInteger.valueOf(-1));
                                proyeccion2[1] = proyeccion2[1].multiply(BigInteger.valueOf(-1));
                            }
                        }
                        BigInteger proyeccion[] = new BigInteger[2];
                        proyeccion[0] = proyeccion1[0].multiply(proyeccion2[1]);
                        proyeccion[1] = proyeccion2[0].multiply(proyeccion1[1]);
                        BigInteger mcd = MCD(proyeccion[0], proyeccion[1]);
                        if (mcd.compareTo(BigInteger.ZERO) != 0) {
                            proyeccion[0] = proyeccion[0].divide(mcd);
                            proyeccion[1] = proyeccion[1].divide(mcd);
                        }
                        if (proyeccion[1].compareTo(BigInteger.ZERO) < 0) {
                            proyeccion[0] = proyeccion[0].multiply(BigInteger.valueOf(-1));
                            proyeccion[1] = proyeccion[1].multiply(BigInteger.valueOf(-1));
                        }
                        if (proyeccion2[1].compareTo(BigInteger.ONE) == 0) {
                            if (proyeccion1[1].compareTo(BigInteger.ONE) == 0) {
                                exp = exp + "-\\frac{" + proyeccion1[0] + "}{" + proyeccion2[0] + "}" + queVector(n, matriz, j);
                            } else {
                                exp = exp + "-\\frac{" + proyeccion1[0] + "/" + proyeccion1[1] + "}{" + proyeccion2[0] + "}" + queVector(n, matriz, j);
                            }
                        } else {
                            if (proyeccion1[1].compareTo(BigInteger.ONE) == 0) {
                                exp = exp + "-\\frac{" + proyeccion1[0] + "}{" + proyeccion2[0] + "/" + proyeccion2[1] + "}" + queVector(n, matriz, j);
                            } else {
                                exp = exp + "-\\frac{" + proyeccion1[0] + "/" + proyeccion1[1] + "}{" + proyeccion2[0] + "/" + proyeccion2[1] + "}" + queVector(n, matriz, j);
                            }
                        }
                        for (int h = 0; h < n; h++) {
                            vector[h][0] = (vector[h][0].multiply(proyeccion[1]).multiply(matriz[j][h][1])).subtract(proyeccion[0].multiply(matriz[j][h][1]).multiply(vector[h][1]));
                            vector[h][1] = vector[h][1].multiply(proyeccion[1]).multiply(matriz[j][h][1]);
                            mcd = MCD(vector[h][0], vector[h][1]);
                            vector[h][0] = vector[h][0].divide(mcd);
                            vector[h][1] = vector[h][1].divide(mcd);
                            if (vector[h][1].compareTo(BigInteger.ZERO) < 0) {
                                vector[h][0] = vector[h][0].multiply(BigInteger.valueOf(-1));
                                vector[h][1] = vector[h][1].multiply(BigInteger.valueOf(-1));
                            }
                        }
                    }
                    for (int j = 0; j < n; j++) {
                        matriz[i][j][0] = vector[j][0];
                        matriz[i][j][1] = vector[j][1];
                    }
                    if (i > 0) {
                        todo = todo + (exp + "\\\\\n");
                        todo = todo + ("\\\\\n");
                        todo = todo + ("= & " + queVector(n, matriz, i) + "\n");
                    }
                    todo = todo + ("\\end{array}\\]\n");
                }
                String exp = "\\[A_1=\\left\\{" + queVector(n, matriz, 0);
                for (int i = 1; i < m; i++) {
                    exp = exp + "," + queVector(n, matriz, i);
                }
                todo = todo + (exp + "\\right\\}\\]\n");
            }
        }
        return todo;
    }

    public static BigInteger[][][] Transpuesta(BigInteger matriz1[][][]){
        boolean verificador = false;
        int n = 0;
        int m = 0;
        BigInteger matriz[][][] = new BigInteger[0][0][2];
        try {
            n = matriz1.length;
            m = matriz1[0].length;
            BigInteger a = matriz1[0][0][0];
            verificador = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe de ingresar una matriz A primero");
        }
        if (verificador == true) {

            matriz = new BigInteger[m][n][2];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j][0] = matriz1[j][i][0];
                    matriz[i][j][1] = matriz1[j][i][1];
                }
            }
        }
        return matriz;
    }
    
    public static String Adjunta(BigInteger matriz1[][][]){
        boolean verificador = false;
        String todo="";
        Determinante(matriz1,"no");
        BigInteger[] detA=new BigInteger[2];
        detA[0] = ElDeterminante[0];
        detA[1] = ElDeterminante[1];
        try {
            BigInteger a = matriz1[0][0][0];
            verificador = true;
        } catch (Exception e) {
            decir("debe ingresar una matriz antes");
        }
        if (verificador == true) {
            int m = matriz1.length;
            int n = matriz1[0].length;
            if (m != n) {
                decir("solo se puede con matrices cuadradas");
            } else {
                todo = "\\[A=" + imprimirdet(matriz1,matriz1.length*2) + "\\]\n\\[adj(A)=\\begin{bmatrix}\n";
                BigInteger matriz[][][] = new BigInteger[m][n][2];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        matriz[i][j][0] = matriz1[i][j][0];
                        matriz[i][j][1] = matriz1[i][j][1];
                    }
                }
                BigInteger adjunta[][][] = new BigInteger[m][n][2];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        adjunta[i][j][1] = BigInteger.ONE;
                    }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        int signo = ((int) Math.pow(-1, (i + j)));
                        BigInteger pequena[][][] = new BigInteger[m - 1][n - 1][2];
                        int c1 = 0;
                        for (int k = 0; k < (m); k++) {
                            int c2 = 0;
                            for (int L = 0; L < (n); L++) {
                                if (k != i && L != j) {
                                    pequena[c1][c2][0] = matriz[k][L][0];
                                    pequena[c1][c2][1] = matriz[k][L][1];
                                    c2++;
                                }
                            }
                            if (k != i) {
                                c1++;
                            }
                        }
                        todo = todo + "(-1)^{" + (i + 1) + "+" + (1 + j) + "}" + imprimirdet(pequena,pequena.length*2);
                        if (j == (n - 1)) {
                            todo = todo + "\\\\\n";
                        } else {
                            todo = todo + "&";
                        }

                        Determinante(pequena,"no");
                        detA[0] = ElDeterminante[0];
                        detA[1] = ElDeterminante[1];

                        adjunta[i][j][0] = BigInteger.valueOf(signo).multiply(detA[0]);
                        adjunta[i][j][1] = detA[1];
                    }
                }
                todo = todo + "\\end{bmatrix}\\]\n\\[adj(A)=" + imprimirdet(adjunta,adjunta.length*2) + "\\]";
            }
        }
        return todo;
    }
    
    public static String Potencia(BigInteger matriz1[][][],int potencia){
        String todo="";
        if (potencia < 2) {
            decir("la potencia tiene que ser al menos de 2");
        } else {
            boolean verificador = false;
            try {
                BigInteger a = matriz1[0][0][0];
                verificador = true;
            } catch (Exception e) {
                decir("ingrese la matriz");
            }
            if (verificador == true) {
                if (matriz1.length != matriz1[0].length) {
                    decir("tiene que ser una matriz cuadrada");
                } else {
                    BigInteger matriz2[][][] = new BigInteger[matriz1.length][matriz1[0].length][2];
                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz1[0].length; j++) {
                            matriz2[i][j][0] = matriz1[i][j][0];
                            matriz2[i][j][1] = matriz1[i][j][1];
                        }
                    }
                    todo = "\\[A=" + imprimirdet(matriz1,matriz1.length*2) + "\\]\n";
                    for (int i = 0; i < potencia - 1; i++) {
                        producto(matriz2,matriz1);
                        matriz2 = multiplicado;
                        if (i == potencia - 2) {
                            todo = todo + "\\[\\therefore";
                        } else {
                            todo = todo + "\\[\\Rightarrow";
                        }
                        todo = todo + " A^{" + (i + 2) + "}=" + imprimirdet(matriz2,matriz2.length*2) + "\\]\n";
                    }
                }
            }
        }
        return todo;
    }

    public static String Suma(BigInteger matriz1[][][],BigInteger matriz2[][][],String signo){
        String todo="";
        boolean verificador = false;
        try {
            int n = matriz1.length;
            n = matriz2.length;
            BigInteger a = matriz1[0][0][0];
            a = matriz2[0][0][0];
            verificador = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debes de ingresar ambas matrizes primero");
        }
        if (verificador == true) {
            if ((matriz1.length == matriz2.length) && (matriz1[0].length == matriz2[0].length)) {
                BigInteger matriz[][][] = new BigInteger[matriz1.length][matriz1[0].length][2];
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        if (signo.equals("+")){
                            matriz[i][j][0] = (matriz1[i][j][0].multiply(matriz2[i][j][1])).add(matriz1[i][j][1].multiply(matriz2[i][j][0]));
                        }else{
                            matriz[i][j][0] = (matriz1[i][j][0].multiply(matriz2[i][j][1])).subtract(matriz1[i][j][1].multiply(matriz2[i][j][0]));
                        }
                        matriz[i][j][1] = matriz1[i][j][1].multiply(matriz2[i][j][1]);
                        BigInteger mcd = MCD(matriz[i][j][0], matriz[i][j][1]);
                        matriz[i][j][0] = matriz[i][j][0].divide(mcd);
                        matriz[i][j][1] = matriz[i][j][1].divide(mcd);
                        if (matriz[i][j][1].compareTo(BigInteger.valueOf(1)) < 0) {
                            matriz[i][j][0] = matriz[i][j][0].multiply(BigInteger.valueOf(-1));
                            matriz[i][j][1] = matriz[i][j][1].multiply(BigInteger.valueOf(-1));
                        }
                    }
                }
                todo = "\\[A"+signo+"B=" + imprimirdet(matriz1,matriz1.length*2) + signo + imprimirdet(matriz2,matriz2.length*2) + "=\\begin{bmatrix}";
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length - 1; j++) {
                        if (matriz1[i][j][1].compareTo(BigInteger.valueOf(1)) == 0) {
                            todo = todo + matriz1[i][j][0] + signo;
                        } else {
                            todo = todo + "\\frac{" + matriz1[i][j][0] + "}{" + matriz1[i][j][1] + "}"+signo;
                        }
                        if (matriz2[i][j][1].compareTo(BigInteger.valueOf(1)) == 0) {
                            todo = todo + matriz2[i][j][0] + "&";
                        } else {
                            todo = todo + "\\frac{" + matriz2[i][j][0] + "}{" + matriz2[i][j][1] + "}&";
                        }
                    }
                    if (matriz1[i][matriz[0].length - 1][1].compareTo(BigInteger.valueOf(1)) == 0) {
                        todo = todo + matriz1[i][matriz[0].length - 1][0] + signo;
                    } else {
                        todo = todo + "\\frac{" + matriz1[i][matriz[0].length - 1][0] + "}{" + matriz1[i][matriz[0].length - 1][1] + "}"+signo;
                    }
                    if (matriz2[i][matriz[0].length - 1][1].compareTo(BigInteger.valueOf(1)) == 0) {
                        todo = todo + matriz2[i][matriz[0].length - 1][0] + "\\\\\n";;
                    } else {
                        todo = todo + "\\frac{" + matriz2[i][matriz[0].length - 1][0] + "}{" + matriz2[i][matriz[0].length - 1][1] + "}\\\\\n";
                    }
                }
                todo = todo + "\\end{bmatrix}=" + imprimirdet(matriz,matriz.length*2);
                todo = todo + "\\]";
            } else {
                decir("las matrices debe de ser del mismo tamaño");
            }
        }
        return todo;
    }

    public static String PAUL(BigInteger matriz[][][],BigInteger vector[][][]){
        String todo="";
        todo=todo+FPAUL(matriz);
        todo=todo+GaussJordan(RL,vector,"no",0);
        todo=todo+GaussJordan(RU,VectorGauss,"no",0);
        return todo;
    }
    
}
