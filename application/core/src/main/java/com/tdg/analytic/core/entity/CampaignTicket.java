package com.tdg.analytic.core.entity;

import lombok.Data;

@Data
public class CampaignTicket {
  private final String campaignId;
  private final String ticketId;
  private final AudiencePreference preference;
}
