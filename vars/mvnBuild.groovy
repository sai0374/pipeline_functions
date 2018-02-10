#!/usr/bin/env groovy
def call(){
  sh """
  source /etc/profile.d/maven.sh
  mvn clean install
"""
}

