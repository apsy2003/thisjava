package sec11.exam02_static_final;

public class Earth {
	
	//�ٲܼ��� ���� ��ü���� ���Ϲ����ϰ� ���� �ϳ��⿡ ���δ� �빮�ڷ� ��.
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
		//���� ���� ���� �ƴ� �ڹ� �ȿ� �ִ� PI Math.PI�� ����ϸ� ��.
	}
}
