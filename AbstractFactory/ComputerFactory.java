public class ComputerFactory extends AbstractFactory {

	@Override
	public Disk getDisk() {
		return new HardDisk();
	}

	@Override
	public Processor getProcessor() {
		return new IntelProcessor();
	}
}