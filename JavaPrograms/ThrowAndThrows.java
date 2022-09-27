package JavaPrograms;

import java.io.IOException;

import javax.sound.midi.MidiDevice.Info;

public class ThrowAndThrows {
	public static void main(String[] args) throws ArithmeticException,InterruptedException,IOException{
		info();
	}
	private static void info() throws IOException{
System.out.println("hello");
throw new IOException();
	}

}
