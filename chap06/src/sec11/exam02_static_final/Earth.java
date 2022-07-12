package sec11.exam02_static_final;

public class Earth {
	
	//바꿀수도 없고 객체마다 유일무이하게 값이 하나기에 전부다 대문자로 씀.
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
		//내가 만든 것이 아닌 자바 안에 있는 PI Math.PI로 사용하면 됨.
	}
}
