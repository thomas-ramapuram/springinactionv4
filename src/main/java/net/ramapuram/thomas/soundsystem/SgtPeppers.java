package net.ramapuram.thomas.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisk {

  private String title = "Sgt Peppers Lonely Herts Club Band";
  private String artist = "The Beatles";

  @Override
  public void play() {
    System.out.printf("Playing %s by %s\n", title, artist);
  }
}
