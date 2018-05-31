<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="ciclos">
        
        <hmtl>
            <table border="1">
            
            
            <xsl:for-each select="ciclo">
                <tr>
                    <td>
                        <xsl:value-of select="nombre"/>
                    </td>
                </tr>
            </xsl:for-each>
            
            </table>
        </hmtl>
        
    </xsl:template>
</xsl:stylesheet>
