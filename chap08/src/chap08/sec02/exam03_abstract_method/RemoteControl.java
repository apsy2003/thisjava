package chap08.sec02.exam03_abstract_method;
	//interface�� ���� ����� ����, ����̶� �̾߱� �ʰ� �����̶� ǥ����. ���� ����.
public interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� //���� �Լ��� ���� ������ ������ �߻���
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
