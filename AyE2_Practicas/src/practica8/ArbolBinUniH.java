package practica8;

public interface ArbolBinUniH<A,B,C,D> {
	
	public void armarHoja(A dato);
	public void armarNodoUn(B dato,ArbolBinUniH<A, B, C, D> arb);
	public void armarNodoBin(C dato,ArbolBinUniH<A, B, C, D> arb1,ArbolBinUniH<A, B, C, D> arb2);
	public D recorrido();

}
