package com.aiyi.server.manager.nginx.bean;

import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;

/**
 * 磁盘信息
 * @ModificationHistory Who When What
 * > 2019-04-19 | 郭胜凯 | create
 */
public class DiskInfo {

  private FileSystem fileSystem;
  
  private FileSystemUsage usage;
  
  private String type;
  
  private String name;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FileSystem getFileSystem() {
    return fileSystem;
  }

  public void setFileSystem(FileSystem fileSystem) {
    this.fileSystem = fileSystem;
  }

  public FileSystemUsage getUsage() {
    return usage;
  }

  public void setUsage(FileSystemUsage usage) {
    this.usage = usage;
  }

  public String getName() {
    if (null != name) {
      name = name.replace("\\", "_").replace("/", "_");
      return name;
    }
    return fileSystem.getDevName().replace("\\", "_").replace("/", "_");
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public long getSuipian() {
    return this.getUsage().getAvail() - this.getUsage().getFree();
  }
}
