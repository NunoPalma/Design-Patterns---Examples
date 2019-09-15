public class ComputerFactory implements AbstractFactory {

	public Disk getDisk() {
		return new HardDisk();
	}

	public Processor getProcessor() {
		return new IntelProcessor();
	}
}