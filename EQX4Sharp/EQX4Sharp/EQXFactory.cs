using System;

namespace EQX4Sharp
{
    using EQX4Sharp.Model;
    using System.IO;
    using System.Xml.Serialization;

    public class EQXFactory
    {
        public Boolean WriteEqx(String path, EqxSensors sensors)
        {
            if (string.IsNullOrEmpty(path))
            {
                return false;
            }
            XmlSerializer serializer = new XmlSerializer(typeof(EqxSensors));
            TextWriter writer = new StreamWriter(path);
            serializer.Serialize(writer, sensors);
            writer.Close();
            return true;
        }

        public EqxSensors ReadEqx(String path)
        {
            if (string.IsNullOrEmpty(path))
            {
                return null;
            }
            XmlSerializer serializer = new XmlSerializer(typeof(EqxSensors));
            StreamReader reader = new StreamReader(path);
            reader.ReadToEnd();
            EqxSensors sensors = (EqxSensors) serializer.Deserialize(reader);
            reader.Close();
            return sensors;
        }
    }
}
