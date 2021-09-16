package com.rana.bitapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = BitApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface BitApplication_GeneratedInjector {
  void injectBitApplication(BitApplication bitApplication);
}
