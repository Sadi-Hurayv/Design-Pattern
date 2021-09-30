

package CodeSmellBasic;

import java.util.List;

    public class XMLGenerator 
    {
        List<Person> list;
        String xmlType;

        public XMLGenerator(List<Person> list, String type)
        {
            this.list = list;
            this.xmlType = type;
        }

        public String GetXMLWithHeader()
        {
            StringBuilder xml = new StringBuilder();
            if (xmlType == "attributewise")
            {
                xml.append("<header attr1=\"id\" attr2=\"name\" attr3=\"email\" />");

                attributeWiseDetails(xml);
            }
            else if (xmlType == "childnodewise")
            {
                xml.append("<header><attr1>id</attr1><attr2>name</attr2><attr3>email</attr3></header>");

                childWiseDetails(xml);
            }
            else
            {

            }

            return xml.toString();
        }

        public String GetXMLWithoutHeader()
        {
            StringBuilder xml = new StringBuilder();
            if (xmlType == "attributewise")
            {

            	attributeWiseDetails(xml);
            }
            else if (xmlType == "childnodewise")
            {

            	childWiseDetails(xml);
            }
            else
            {

            }
            

            return xml.toString();
        }

        public String GetXMLWithHeaderAndFooter()
        {
            StringBuilder xml = new StringBuilder();
            if (xmlType == "attributewise")
            {
                xml.append("<root>");
                xml.append("<header attr1=\"id\" attr2=\"name\" attr3=\"email\" />");

                attributeWiseDetails(xml);
                xml.append("<footer total_records=\"" + list.size() + "\" />");
                xml.append("</root>");
            }
            else if (xmlType == "childnodewise")
            {
                xml.append("<root>");
                xml.append("<header><attr1>id</attr1><attr2>name</attr2><attr3>email</attr3></header>");
              
                childWiseDetails(xml);
                xml.append("<footer><total_records>" + list.size() + "</total_records></footer>");
                xml.append("</root>");
            }
            else
            {

            }

            
            return xml.toString();
        }
        
        public void attributeWiseDetails(StringBuilder xml) {
        	for (int i = 0; i < list.size(); i++)
            {
                xml.append("<person id=\"" + list.get(i).Id + "\" name=\"" + list.get(i).Name + "\" email=\"" + list.get(i).Email + "\" />");
            }
        }
        
        public void childWiseDetails(StringBuilder xml) {
        	for (int i = 0; i < list.size(); i++)
            {
                xml.append("<person><id>" + list.get(i).Id + "</id><name>" + list.get(i).Name + "</name><email>" + list.get(i).Email + "</email></person>");
            }
        }
    }

