/*﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;*/

package CodeSmellBasic;
import java.util.List;

    public class CSVGenerator 
    {
        List<Person> aList;
        StringBuilder csv = new StringBuilder();

        public CSVGenerator(List<Person> list)
        {
            aList = list;
        }

        public String GetCSVWithHeader()
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Id,Name,Email\n");

            details(sb);
            return sb.toString();
        }

        public String GetCSVWithoutHeader()
        {
            StringBuilder sb = new StringBuilder();

            details(sb);
            return sb.toString();
        }

        public String GetCSVWithHeaderAndFooter()
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Id,Name,Email\n");

            details(sb);
            sb.append("Total Records:" + aList.size()+"\n");
            return sb.toString();
        }
        
        public void details(StringBuilder sb) {
        	for (int i = 0; i < aList.size(); i++)
            {
                sb.append(aList.get(i).Id + "," + aList.get(i).Name + "," + aList.get(i).Email+"\n");
            }
        }
    }
