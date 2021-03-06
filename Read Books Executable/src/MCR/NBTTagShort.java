package MCR;


import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagShort extends NBTBase
{

    public NBTTagShort()
    {
    }

    public NBTTagShort(short word0)
    {
        shortValue = word0;
    }

    void writeTagContents(DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeShort(shortValue);
    }

    void readTagContents(DataInput datainput)
        throws IOException
    {
        shortValue = datainput.readShort();
    }

    public byte getType()
    {
        return 2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(shortValue).toString();
    }

    public short shortValue;
}
