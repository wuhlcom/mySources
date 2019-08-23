package zhilutec.netty;
 

/**
 * 说明：协议消息头
 *
 * @author <a href="http://www.waylau.com">waylau.com</a> 2015年11月4日 
 */
public class ProtocolHeader{
 
	private byte begin; 	// 魔数
	private short version;	// 消息类型
	private short len;	// // 长度

	public byte getBegin() {
		return begin;
	}

	public void setBegin(byte begin) {
		this.begin = begin;
	}

	public short getVersion() {
		return version;
	}

	public void setVersion(short version) {
		this.version = version;
	}

	public short getLen() {
		return len;
	}

	public void setLen(short len) {
		this.len = len;
	}

	public ProtocolHeader() {
	}

	public ProtocolHeader(byte begin, short version, short len) {
		this.begin = begin;
		this.version = version;
		this.len = len;
	}
}
